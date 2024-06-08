package com.scarnezis.decrypto_smc.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Market {

    @Id
    private String id;
    private String code;
    private String description;
    @ManyToOne
    private Country country;
}
