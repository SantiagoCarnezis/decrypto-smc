package com.scarnezis.decrypto_smc.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CreateClientDto {

    private String description;
    @NotEmpty
    private List<Long> marketIds;
}
