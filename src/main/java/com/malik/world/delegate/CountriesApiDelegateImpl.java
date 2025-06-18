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
public class CountriesApiDelegateImpl implements CountriesApiDelegate {
    @Autowired
    private CountryService countryService;

    @Override
    public ResponseEntity<List<Country>> listCountries(Integer limit) {
//        Country country = new Country();
//        country.setCode("A");
//        country.setName("AA");
//        country.setId(123L);
//
//        ArrayList<Country> countries = new ArrayList<>();
//        countries.add(country);
        return new ResponseEntity<>(countryService.getCountries(), HttpStatus.OK);
    }
}
