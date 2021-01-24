package com.nicolasDev.fletapp.services;

import com.nicolasDev.fletapp.models.Client;
import com.nicolasDev.fletapp.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getClients(){
        return clientRepository.findAll();
    }

    public void save(Client client){
        clientRepository.save(client);
    }

    public void update(Client client){
        clientRepository.save(client);
    }

    public Optional<Client> getById(Integer Id){
        return clientRepository.findById(Id);
    }

    public void delete(Integer id){
        clientRepository.deleteById(id);
    }
}
