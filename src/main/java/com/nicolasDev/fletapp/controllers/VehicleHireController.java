package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.VehicleHire;
import com.nicolasDev.fletapp.models.VehicleMovement;
import com.nicolasDev.fletapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleHireController {
    @GetMapping("vehicleHire")
    public String getVehicleHire(){
        return "vehicleHire";
    }

    @Autowired
    private VehicleHireService vehicleHireService;

    @Autowired
    private ClientService clientService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicleHire")
    public String getVehicleMovement(Model model){
        model.addAttribute("clients",clientService.getClients());
        model.addAttribute("locations",locationService.getLocations());
        model.addAttribute("vehicles",vehicleService.getVehicles());
        model.addAttribute("vehicleHires", vehicleHireService.findAll());
        return "vehicleHire";
    }

    @PostMapping("/vehicleHire/addNew")
    public String addNew(VehicleHire vehicleHire){
        vehicleHireService.save(vehicleHire);
        return "redirect:/vehicleHire";
    }


    @RequestMapping(value = "vehicleHire/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleHire vehicleHire){
        vehicleHireService.update(vehicleHire);
        return "redirect:/vehicleHire";
    }

    @RequestMapping(value = "vehicleHire/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String update(int id){
        vehicleHireService.deleteById(id);
        return "redirect:/vehicleHire";
    }

    @RequestMapping("/vehicleHire/findById")
    @ResponseBody
    public Optional<VehicleHire> findById(int id){
        return vehicleHireService.getById(id);
    }
}
