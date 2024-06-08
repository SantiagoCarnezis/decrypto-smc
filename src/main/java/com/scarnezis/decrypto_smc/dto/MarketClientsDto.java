package com.scarnezis.decrypto_smc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MarketClientsDto {

    private String code;
    private Long clients;

    public MarketClientsDto(String code, long clients) {
        this.code = code;
        this.clients = clients;
    }
}