package com.scarnezis.desafio_crypto_la.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Country {

    @Id
    private String code;
    private String name;
}
