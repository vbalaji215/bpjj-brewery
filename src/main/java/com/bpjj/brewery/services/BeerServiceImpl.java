package com.bpjj.brewery.services;

import com.bpjj.brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * vbala created on 3/14/2020
 * Inside the package - com.bpjj.brewery.services
 **/
@Service
@Slf4j
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Car")
                .beerStyle("Pale Ale")
                .build();
    }

    @Override
    public BeerDto createBeer(BeerDto beerDto) {
        return beerDto;
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        log.debug("Update the beer");
    }

    @Override
    public void deleteBeer(UUID beerId) {
        log.debug("Delete the beer");
    }
}
