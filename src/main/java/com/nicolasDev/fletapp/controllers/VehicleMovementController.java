package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.JobTitle;
import com.nicolasDev.fletapp.models.VehicleMovement;
import com.nicolasDev.fletapp.services.LocationService;
import com.nicolasDev.fletapp.services.VehicleMovementService;
import com.nicolasDev.fletapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleMovementController {

    @Autowired
    private VehicleMovementService vehicleMovementService;

    @Autowired
    private LocationService locationService;

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicleMovement")
    public String getVehicleMovement(Model model){
        model.addAttribute("locations",locationService.getLocations());
        model.addAttribute("vehicles",vehicleService.getVehicles());
        model.addAttribute("vehicleMovements", vehicleMovementService.getVehiclesMovement());
        return "vehicleMovement";
    }

    @PostMapping("/vehicleMovement/addNew")
    public String addNew(VehicleMovement vehicleMovement){
        vehicleMovementService.save(vehicleMovement);
        return "redirect:/vehicleMovement";
    }


    @RequestMapping(value = "vehicleMovement/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMovement vehicleMovement){
        vehicleMovementService.update(vehicleMovement);
        return "redirect:/vehicleMovement";
    }

    @RequestMapping(value = "vehicleMovement/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String update(int id){
        vehicleMovementService.deleteById(id);
        return "redirect:/vehicleMovement";
    }

    @RequestMapping("/vehicleMovement/findById")
    @ResponseBody
    public Optional<VehicleMovement> findById(int id){
        return vehicleMovementService.getById(id);
    }
}
