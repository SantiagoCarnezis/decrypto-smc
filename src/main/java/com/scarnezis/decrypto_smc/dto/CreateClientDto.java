package com.scarnezis.decrypto_smc.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateClientDto {

    private String id;
    private String description;
    private List<String> marketIds;
}
