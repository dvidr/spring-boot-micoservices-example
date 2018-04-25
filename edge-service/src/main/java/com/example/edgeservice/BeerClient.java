package com.example.edgeservice;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.hateoas.Resources;

@FeignClient("beer-catalog-service")
interface BeerClient {
    @GetMapping("/beers")
    Resources<Beer> readBeers();
}
