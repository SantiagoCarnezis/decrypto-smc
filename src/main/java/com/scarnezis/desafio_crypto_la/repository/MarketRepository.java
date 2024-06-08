package com.scarnezis.desafio_crypto_la.repository;

import com.scarnezis.desafio_crypto_la.entity.Market;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarketRepository extends JpaRepository<Market, String> {
}
