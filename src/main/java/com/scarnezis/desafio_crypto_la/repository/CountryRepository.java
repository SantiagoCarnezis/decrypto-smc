package com.scarnezis.desafio_crypto_la.repository;

import com.scarnezis.desafio_crypto_la.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
