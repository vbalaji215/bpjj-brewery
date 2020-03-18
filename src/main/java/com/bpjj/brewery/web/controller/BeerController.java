package com.bpjj.brewery.web.controller;

import com.bpjj.brewery.services.BeerService;
import com.bpjj.brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

/**
 * BeerController method
 */
@RequestMapping("/api/v1/beer")
@RestController
@Slf4j
public class BeerController {

    /**
     * Beerservice attribute
     */
    private final BeerService beerService;

    /**
     * Environment variable
     */
    private final Environment environment;

    /**
     * @param beerService
     */
    public BeerController(BeerService beerService, Environment environment) {

        this.beerService = beerService;
        this.environment = environment;
    }


    /**
     * @param beerId
     * @return
     */
    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId){
        return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }

    /**
     * @param beerDto
     * @return
     */
    @PostMapping
    public ResponseEntity<BeerDto> createBeer(@RequestBody BeerDto beerDto){
        BeerDto saveBeerDto = beerService.createBeer(beerDto);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Location","/api/vi/beer" + saveBeerDto.getId().toString());
        log.debug("Inside the create beer method");
        return new ResponseEntity<>(headers,HttpStatus.CREATED);
    }

    /**
     * @param beerId
     * @param beerDto
     * @return
     */
    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> saveBeer(@PathVariable UUID beerId,
                                            @RequestBody BeerDto beerDto){
        beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    /**
     * @param beerId
     */
    @DeleteMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeer(@PathVariable UUID beerId){
        beerService.deleteBeer(beerId);
    }

}
