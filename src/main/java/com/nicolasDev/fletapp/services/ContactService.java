package com.nicolasDev.fletapp.services;


import com.nicolasDev.fletapp.models.Contact;
import com.nicolasDev.fletapp.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public List<Contact> getClients(){
        return contactRepository.findAll();
    }

    public void save(Contact client){
        contactRepository.save(client);
    }

    public void update(Contact client){
        contactRepository.save(client);
    }

    public Optional<Contact> getById(Integer Id){
        return contactRepository.findById(Id);
    }

    public void delete(Integer id){
        contactRepository.deleteById(id);
    }
}
