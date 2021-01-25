package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.Vehicle;
import com.nicolasDev.fletapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleController {

    @Autowired
    private VehicleService vehicleService;

    @GetMapping("/vehicle")
    public String getVehicle(Model model){
        model.addAttribute("vehicles",vehicleService.getVehicles());
        return "vehicle";
    }

    @PostMapping("/vehicle/addNew")
    public String addNew(Vehicle vehicle){
        vehicleService.addNew(vehicle);
        return "redirect:/vehicle";
    }

    @RequestMapping(value = "/vehicle/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Vehicle vehicle){
        vehicleService.update(vehicle);
        return "redirect:/vehicle";
    }

    @RequestMapping(value = "vehicle/delete",method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        vehicleService.delete(id);
        return "redirect:/vehicle";
    }

    @RequestMapping("/vehicle/findById")
    @ResponseBody
    public Optional<Vehicle> findById(Integer id){
        return vehicleService.findById(id);
    }
}
