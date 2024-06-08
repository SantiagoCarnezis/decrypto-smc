package com.scarnezis.desafio_crypto_la.repository;

import com.scarnezis.desafio_crypto_la.dto.MarketClientsDto;
import com.scarnezis.desafio_crypto_la.entity.Client;
import com.scarnezis.desafio_crypto_la.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, String> {

    @Query(value =
            "SELECT "+
                    " new com.scarnezis.desafio_crypto_la.dto.MarketClientsDto(m.code, COUNT (c)) " +
                    "FROM Client c " +
                    "JOIN c.markets m " +
                    "WHERE m.country = ?1 " +
                    "GROUP BY m.code"
    )
    List<MarketClientsDto> findStatsPerCountry(Country country);

    @Query(value =
            "SELECT "+
                    " COUNT (m) " +
                    "FROM Client c " +
                    "JOIN c.markets m")
    int totalRelations();
}
