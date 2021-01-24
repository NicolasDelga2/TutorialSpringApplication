package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.InvoiceStatus;
import com.nicolasDev.fletapp.repositories.InvoiceStatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceStatusService {

    @Autowired
    private InvoiceStatusRepository invoiceStatusRepository;

    // Get
    public List<InvoiceStatus> getInvoiceStatus(){
        return invoiceStatusRepository.findAll();
    }

    // Get by Id
    public Optional<InvoiceStatus> getById(Integer id){
        return invoiceStatusRepository.findById(id);
    }

    // Save
    public void saveInvoiceStatus(InvoiceStatus invoiceStatus){
        invoiceStatusRepository.save(invoiceStatus);
    }

    // Update
    public void updateInvoiceStatus(InvoiceStatus invoiceStatus){
        invoiceStatusRepository.save(invoiceStatus);
    }

    // Delete
    public void deleteInvoiceStatus(Integer id){
        invoiceStatusRepository.deleteById(id);
    }
}
