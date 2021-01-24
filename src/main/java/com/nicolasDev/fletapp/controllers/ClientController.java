package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.Client;
import com.nicolasDev.fletapp.models.Country;
import com.nicolasDev.fletapp.models.State;
import com.nicolasDev.fletapp.services.ClientService;
import com.nicolasDev.fletapp.services.CountryService;
import com.nicolasDev.fletapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ClientController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private StateService stateService;
    @Autowired
    private CountryService countryService;

    @GetMapping("/client")
    public String getClient(Model model){
        List<Client> clientList = clientService.getClients();
        List<Country> countryList = countryService.getCountries();
        List<State> stateList = stateService.getStates();

        model.addAttribute("countryList",countryList);
        model.addAttribute("stateList", stateList);
        model.addAttribute("clientList", clientList);
        return "client";
    }

    @PostMapping("/client/addNew")
    public String save(Client client){
        clientService.save(client);
        return "redirect:/client";
    }

    @RequestMapping("client/findById")
    @ResponseBody
    public Optional<Client> getById(Integer id){
        return clientService.getById(id);
    }

    @RequestMapping(value = "client/update", method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Client client){
        clientService.save(client);
        return "redirect:/client";
    }

    @RequestMapping(value = "client/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        clientService.delete(id);
        return "redirect:/client";
    }




}
