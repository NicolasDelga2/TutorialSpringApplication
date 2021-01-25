package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.VehicleMaintenance;
import com.nicolasDev.fletapp.repositories.VehicleMaintenenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleMaintenenceService {
    @Autowired
    private VehicleMaintenenceRepository vehicleMaintenenceRepository;

    public List<VehicleMaintenance> getVehicleMaintenance(){
        return vehicleMaintenenceRepository.findAll();
    }

    public void addNew(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenenceRepository.save(vehicleMaintenance);
    }

    public void update(VehicleMaintenance vehicleMaintenence){
        vehicleMaintenenceRepository.save(vehicleMaintenence);
    }

    public void delete(Integer id){
        vehicleMaintenenceRepository.deleteById(id);
    }

    public Optional<VehicleMaintenance> findById(Integer id){
        return vehicleMaintenenceRepository.findById(id);
    }
}
