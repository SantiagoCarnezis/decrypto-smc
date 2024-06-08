package com.scarnezis.decrypto_smc.repository;

import com.scarnezis.decrypto_smc.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, String> {
}
