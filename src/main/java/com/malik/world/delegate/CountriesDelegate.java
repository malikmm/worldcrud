package com.malik.world.delegate;

import com.malik.openapi.api.CountriesApiDelegate;
import com.malik.openapi.model.Country;
import com.malik.world.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountriesDelegate implements CountriesApiDelegate {
    private CountryService countryService;

    @Autowired
    public CountriesDelegate(CountryService countryService) {
        this.countryService = countryService;
    }

    @Override
    public ResponseEntity<List<Country>> listCountries(Integer limit) {
        return new ResponseEntity<>(countryService.getCountries(), HttpStatus.OK);
    }
}
