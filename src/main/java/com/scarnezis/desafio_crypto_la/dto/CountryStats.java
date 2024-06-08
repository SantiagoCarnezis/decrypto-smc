package com.scarnezis.desafio_crypto_la.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@Getter
@Setter
public class CountryStats {

    private String country;
    private List<Map<String, PercentageStats>> markets = new LinkedList<>();

    public void addMarket(Map<String, PercentageStats> marketResponse) {
        markets.add(marketResponse);
    }
}
