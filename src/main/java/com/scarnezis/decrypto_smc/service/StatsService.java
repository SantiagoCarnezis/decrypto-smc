package com.scarnezis.decrypto_smc.service;

import com.scarnezis.decrypto_smc.dto.*;
import com.scarnezis.decrypto_smc.entity.Client;
import com.scarnezis.decrypto_smc.entity.Country;
import com.scarnezis.decrypto_smc.entity.Market;
import com.scarnezis.decrypto_smc.repository.ClientRepository;
import com.scarnezis.decrypto_smc.repository.CountryRepository;
import com.scarnezis.decrypto_smc.repository.MarketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

@Service
public class StatsService {

    private final MarketRepository marketRepository;
    private final ClientRepository clientRepository;
    private final CountryRepository countryRepository;

    @Autowired
    public StatsService(MarketRepository marketRepository, ClientRepository clientRepository, CountryRepository countryRepository) {
        this.marketRepository = marketRepository;
        this.clientRepository = clientRepository;
        this.countryRepository = countryRepository;
    }

    public List<CountryStats> getStats() {

        long totalRelations = clientRepository.totalRelations();
        List<Country> countries = countryRepository.findAll();
        List<MarketClientsDto> marketClientsList;
        LinkedList<CountryStats> response = new LinkedList<>();
        CountryStats countryStats;
        Map<String, PercentageStats> marketResponse;

        for (Country country: countries) {

            marketClientsList = clientRepository.findStatsPerCountry(country);
            countryStats = new CountryStats();
            countryStats.setCountry(country.getName());

            for (MarketClientsDto marketClients: marketClientsList) {

                BigDecimal percentage = BigDecimal.valueOf(marketClients.getClients() * 100)
                        .divide(new BigDecimal(totalRelations), 2, RoundingMode.HALF_DOWN);

                marketResponse = new HashMap<>();
                marketResponse.put(marketClients.getCode(), new PercentageStats(percentage));

                countryStats.addMarket(marketResponse);
            }

            response.add(countryStats);
        }

        return response;
    }

    public Market createMarket(CreateMarketDto marketDto){

        Market market = new Market();
        market.setCode(marketDto.getCode());
        market.setDescription(marketDto.getDescription());

        Optional<Country> countryOptional = countryRepository.findById(marketDto.getCountryCode());
        market.setCountry(countryOptional.orElseThrow());

        return marketRepository.save(market);
    }

    public List<Market> getMarket(){

        return marketRepository.findAll();
    }

    public Client createClient(CreateClientDto clientDto){

        Client client = new Client();
        client.setDescription(clientDto.getDescription());
        List<Market> markets = marketRepository.findAllById(clientDto.getMarketIds());
        client.setMarkets(markets);

        return clientRepository.save(client);
    }
}
