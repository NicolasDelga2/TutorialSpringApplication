package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.VehicleStatus;
import com.nicolasDev.fletapp.repositories.VehicleStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleStatusService {

    @Autowired
    private VehicleStatusRepository vehicleStatusRepository;

    // Get
    public List<VehicleStatus> getVehicleStatus(){
        return vehicleStatusRepository.findAll();
    }
    // Save
    public void saveVehicleStatus(VehicleStatus vehicleStatus){
        vehicleStatusRepository.save(vehicleStatus);
    }
    // Get By Id
    public Optional<VehicleStatus> getById(Integer id){
        return vehicleStatusRepository.findById(id);
    }

    // Update
    public void updateVehicleStatus(VehicleStatus vehicleStatus){
        vehicleStatusRepository.save(vehicleStatus);
    }

    // Delete
    public void deleteVehicleStatus(Integer id){
        vehicleStatusRepository.deleteById(id);
    }

}
