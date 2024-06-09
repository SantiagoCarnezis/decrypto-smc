package com.scarnezis.decrypto_smc.dto;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class CreateMarketDto {

    @NonNull
    private String code;
    private String description;
    @NonNull
    private String countryCode;
}
