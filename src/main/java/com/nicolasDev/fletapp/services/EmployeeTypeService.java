package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.EmployeeType;
import com.nicolasDev.fletapp.repositories.EmployeeTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeTypeService {
    @Autowired
    private EmployeeTypeRepository employeeTypeRepository;

    // Get
    public List<EmployeeType> getEmployeeType(){
        return employeeTypeRepository.findAll();
    }

    // Get by Id
    public Optional<EmployeeType> getById(Integer id){
        return employeeTypeRepository.findById(id);
    }

    // Save
    public void saveEmployeeType(EmployeeType employeeType){
        employeeTypeRepository.save(employeeType);
    }

    // Update
    public void updateEmployeeType(EmployeeType employeeType){
        employeeTypeRepository.save(employeeType);
    }

    // Delete
    public void deleteEmployeeType(Integer id){
        employeeTypeRepository.deleteById(id);
    }


}
