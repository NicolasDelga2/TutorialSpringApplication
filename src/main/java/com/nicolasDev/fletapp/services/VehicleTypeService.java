package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.VehicleMake;
import com.nicolasDev.fletapp.models.VehicleType;
import com.nicolasDev.fletapp.repositories.VehicleTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleTypeService {

    @Autowired
    private VehicleTypeRepository vehicleTypeRepository;

    public List <VehicleType> getVehicleType(){
        return vehicleTypeRepository.findAll();
    }

    public void addNew(VehicleType vehicleType){
        vehicleTypeRepository.save(vehicleType);
    }

    public void update(VehicleType vehicleType) {
        vehicleTypeRepository.save(vehicleType);
    }

    public void delete(Integer id) {
        vehicleTypeRepository.deleteById(id);
    }

    public Optional<VehicleType> findById(Integer id) {
        return vehicleTypeRepository.findById(id);
    }
}
