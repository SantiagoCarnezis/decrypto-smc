package com.scarnezis.decrypto_smc.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table
@Getter
@Setter
public class Client {

    @Id
    private String id;
    private String description;
    @ManyToMany
    @JoinTable(name = "client_market")
    @NotEmpty
    private List<Market> markets;
}
