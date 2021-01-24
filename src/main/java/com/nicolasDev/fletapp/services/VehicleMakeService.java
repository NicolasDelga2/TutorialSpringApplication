package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.Location;
import com.nicolasDev.fletapp.models.Vehicle;
import com.nicolasDev.fletapp.models.VehicleMake;
import com.nicolasDev.fletapp.repositories.LocationRepository;
import com.nicolasDev.fletapp.repositories.VehicleMakeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMakeService {
    @Autowired
    private VehicleMakeRepository vehicleMakeRepository;

    public List<VehicleMake> getVehiclesMake() {
        return vehicleMakeRepository.findAll();
    }

    public void addNew(VehicleMake vehicleMake) {
        vehicleMakeRepository.save(vehicleMake);
    }

    public void update(VehicleMake vehicleMake) {
        vehicleMakeRepository.save(vehicleMake);
    }

    public void delete(Integer id) {
        vehicleMakeRepository.deleteById(id);
    }

    public Optional<VehicleMake> findById(Integer id) {
        return vehicleMakeRepository.findById(id);
    }
}
