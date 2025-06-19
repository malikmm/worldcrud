package com.malik.world.service;

import com.malik.openapi.model.City;
import com.malik.world.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private CityRepository cityRepository;

    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    public City getCityById(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

//    public City createCity(City city) {
//        return CityRepository.save(city);
//    }
//
//    public City updateCity(Long id, City city) {
//        City existingCity = CityRepository.findById(id).orElse(null);
//        if (existingCity != null) {
////            existingCity.setTitle(City.getTitle());
////            existingCity.setAuthor(City.getAuthor());
////            existingCity.setYearPublished(City.getYearPublished());
//            return CityRepository.save(existingCity);
//        } else {
//            return null;
//        }
//    }
//
//    public void deleteCity(Long id) {
//        CityRepository.deleteById(id);
//    }
}
