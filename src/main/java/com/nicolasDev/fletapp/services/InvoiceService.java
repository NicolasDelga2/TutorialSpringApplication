package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.Invoice;
import com.nicolasDev.fletapp.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    public List<Invoice> getInvoices() {
        return invoiceRepository.findAll();
    }

    public void addNew(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public Optional<Invoice> findById(Integer id) {
        return invoiceRepository.findById(id);
    }

    public void update(Invoice invoice) {
        invoiceRepository.save(invoice);
    }

    public void delete(Integer id) {
        invoiceRepository.deleteById(id);
    }
}
