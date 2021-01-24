package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.Location;
import com.nicolasDev.fletapp.repositories.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LocationService {

    @Autowired
    private LocationRepository locationRepository;

    public List<Location> getLocations() {
        return locationRepository.findAll();
    }

    public void addNew(Location location) {
        locationRepository.save(location);
    }

    public void update(Location location) {
        locationRepository.save(location);
    }

    public void delete(Integer id) {
        locationRepository.deleteById(id);
    }

    public Optional<Location> findById(Integer id) {
        return locationRepository.findById(id);
    }
}
