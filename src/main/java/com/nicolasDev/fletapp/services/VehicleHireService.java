package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.VehicleHire;
import com.nicolasDev.fletapp.repositories.VehicleHireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleHireService {

    @Autowired
    private VehicleHireRepository vehicleHireRepository;

    // Get
    public List<VehicleHire> findAll(){
        return vehicleHireRepository.findAll();
    }
    // Save
    public void save(VehicleHire vehicleHire){
        vehicleHireRepository.save(vehicleHire);
    }
    // Update
    public void update(VehicleHire vehicleHire){
        vehicleHireRepository.save(vehicleHire);
    }
    // Get By Id
    public Optional<VehicleHire> getById(int id){
        return vehicleHireRepository.findById(id);
    }
    // Delete By Id
    public void deleteById(int id){
        vehicleHireRepository.deleteById(id);
    }
}
