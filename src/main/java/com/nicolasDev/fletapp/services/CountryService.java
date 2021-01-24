package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.Country;
import com.nicolasDev.fletapp.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {

     @Autowired
     private CountryRepository countryRepository;


    // Return list of countries
    public List<Country> getCountries(){
        return countryRepository.findAll();
    }


    // Save new Country
    public void saveNewCountry(Country country){
        countryRepository.save(country);
    }

    //getById
    public Optional<Country> findById(Integer Id){
        return countryRepository.findById(Id);
    }

    public void delete(Integer id) {
        countryRepository.deleteById(id);
    }
}
