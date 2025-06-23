package com.malik.world.service;

import com.malik.openapi.model.Country;
import com.malik.world.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    private final CountryRepository countryRepository;

    @Autowired
    public CountryService(CountryRepository countryRepository) {
        this.countryRepository = countryRepository;
    }

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Optional<Country> findCountryById(Long id) {
        return countryRepository.findById(id);
    }

    public Country findByName(String name) {
        Country country = countryRepository.findByName(name);
        return country;
    }
}
