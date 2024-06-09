package com.scarnezis.decrypto_smc.controller;

import com.scarnezis.decrypto_smc.dto.CreateClientDto;
import com.scarnezis.decrypto_smc.dto.CreateMarketDto;
import com.scarnezis.decrypto_smc.service.StatsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StatsController {

    private final StatsService service;

    @Autowired
    public StatsController(StatsService service) {
        this.service = service;
    }

    @GetMapping("/stats")
    public ResponseEntity getStats() {

        return ResponseEntity.ok(service.getStats());
    }

    @PostMapping("/market")
    public ResponseEntity createMarket(@RequestBody CreateMarketDto marketDto) {

        return ResponseEntity.ok(service.createMarket(marketDto));
    }

    @GetMapping("/market")
    public ResponseEntity getMarket() {

        return ResponseEntity.ok(service.getMarket());
    }

    @PostMapping("/client")
    public ResponseEntity createClient(@RequestBody CreateClientDto clientDto) {

        return ResponseEntity.ok(service.createClient(clientDto));
    }
}
