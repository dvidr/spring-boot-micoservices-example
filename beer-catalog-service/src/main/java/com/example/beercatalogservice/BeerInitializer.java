package com.example.beercatalogservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
class BeerInitializer implements CommandLineRunner {

    private final BeerRepository beerRepository;

    BeerInitializer(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Stream.of("Kentucky Brunch Brand Stout", "Good Morning", "Very Hazy", "King Julius",
                "Budweiser", "Coors Light", "PBR")
                .forEach(beer -> beerRepository.save(new Beer(beer)));

        beerRepository.findAll().forEach(System.out::println);
    }
}
