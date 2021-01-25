package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.Vehicle;
import com.nicolasDev.fletapp.repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleService {

    @Autowired
    private VehicleRepository vehicleRepository;

    public List<Vehicle> getVehicles(){
        return vehicleRepository.findAll();
    }

    public void addNew (Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    public void update(Vehicle vehicle){
        vehicleRepository.save(vehicle);
    }

    public Optional<Vehicle> findById(Integer id){
        return vehicleRepository.findById(id);
    }

    public void delete(Integer id){
        vehicleRepository.deleteById(id);
    }
}
