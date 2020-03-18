package com.bpjj.brewery.services;

import com.bpjj.brewery.web.model.BeerDto;

import java.util.UUID;

/**
 * vbala created on 3/14/2020
 * Inside the package - com.bpjj.brewery.services
 **/
public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto createBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
    void deleteBeer(UUID beerId);
}
