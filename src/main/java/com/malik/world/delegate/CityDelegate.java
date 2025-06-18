package com.malik.world.delegate;

import com.malik.openapi.api.CitiesApiDelegate;
import com.malik.openapi.model.City;
import com.malik.world.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityDelegate implements CitiesApiDelegate {
    @Autowired
    private CityService cityService;

    @Override
    public ResponseEntity<List<City>> listCities(Integer limit) {
        return new ResponseEntity<>(cityService.getAllCities(), HttpStatus.OK);
    }
}
