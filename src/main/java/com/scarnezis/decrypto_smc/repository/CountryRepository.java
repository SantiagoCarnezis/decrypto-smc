package com.scarnezis.decrypto_smc.repository;

import com.scarnezis.decrypto_smc.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
