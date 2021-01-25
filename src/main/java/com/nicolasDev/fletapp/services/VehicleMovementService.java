package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.VehicleMovement;
import com.nicolasDev.fletapp.repositories.VehicleModelRepository;
import com.nicolasDev.fletapp.repositories.VehicleMovementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMovementService {


    @Autowired
    private VehicleMovementRepository vehicleMovementRepository;

    // Get
    public List<VehicleMovement> getVehiclesMovement(){
        return vehicleMovementRepository.findAll();
    }
    // Save
    public void save(VehicleMovement vehicleMovement){
        vehicleMovementRepository.save(vehicleMovement);
    }
    // Update
    public void update(VehicleMovement vehicleMovement){
        vehicleMovementRepository.save(vehicleMovement);
    }
    // Get By Id
    public Optional<VehicleMovement> getById(Integer id){
        return vehicleMovementRepository.findById(id);
    }
    // Delete By Id
    public void deleteById(Integer id){
        vehicleMovementRepository.deleteById(id);
    }

}
