package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.Supplier;
import com.nicolasDev.fletapp.repositories.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepository supplierRepository;

    public List<Supplier> getSuppliers() {
        return supplierRepository.findAll();
    }

    public void save(Supplier supplier){
        supplierRepository.save(supplier);
    }

    public void update(Supplier supplier){
        supplierRepository.save(supplier);
    }

    public void delete(Integer id){
        supplierRepository.deleteById(id);
    }

    public Optional<Supplier> getById(Integer id){
        return supplierRepository.findById(id);
    }






}
