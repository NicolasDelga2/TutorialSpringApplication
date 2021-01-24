package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.VehicleModel;
import com.nicolasDev.fletapp.repositories.VehicleModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleModelService {

    @Autowired
    private VehicleModelRepository vehicleModelRepository;

    // Get
    public List<VehicleModel> getVehicleModel(){
        return vehicleModelRepository.findAll();
    }
    // Save
    public void save(VehicleModel vehicleModel){
        vehicleModelRepository.save(vehicleModel);
    }
    // Update
    public void update(VehicleModel vehicleModel){
        vehicleModelRepository.save(vehicleModel);
    }
    // Get By Id
    public Optional<VehicleModel> getById(Integer id){
        return vehicleModelRepository.findById(id);
    }
    // Delete By Id
    public void deleteById(Integer id){
        vehicleModelRepository.deleteById(id);
    }


}
