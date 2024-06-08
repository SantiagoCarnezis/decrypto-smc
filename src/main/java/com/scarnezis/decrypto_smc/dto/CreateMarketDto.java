package com.scarnezis.decrypto_smc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateMarketDto {

    private String id;
    private String code;
    private String description;
    private String countryCode;
}
