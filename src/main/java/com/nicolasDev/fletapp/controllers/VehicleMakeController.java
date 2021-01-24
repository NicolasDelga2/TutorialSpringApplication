package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.VehicleMake;
import com.nicolasDev.fletapp.services.VehicleMakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleMakeController {

    @Autowired
    private VehicleMakeService vehicleMakeService;

    // Get
    @GetMapping("/vehicleMake")
    public String getVehicleMake(Model model){
        List<VehicleMake> vehicleMakeList = vehicleMakeService.getVehiclesMake();
        model.addAttribute("vehicleMakeList", vehicleMakeList);
        return "vehicleMake";
    }

    // Add New
    @PostMapping("/vehicleMake/addNew")
    public String addNew(VehicleMake vehicleMake){
        vehicleMakeService.addNew(vehicleMake);
        return "redirect:/vehicleMake";
    }

    // Update VehicleMake
    @RequestMapping(value = "/vehicleMake/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMake vehicleMake){
        vehicleMakeService.update(vehicleMake);
        return "redirect:/vehicleMake";
    }

    // Delete
    @RequestMapping(value = "/vehicleMake/delete", method = {RequestMethod.PUT, RequestMethod.GET})
    public String delete(Integer id){
        vehicleMakeService.delete(id);
        return "redirect:/vehicleMake";
    }

    // find by Id
    @RequestMapping("/vehicleMake/findById")
    @ResponseBody
    public Optional<VehicleMake> findById(Integer id){
        return vehicleMakeService.findById(id);
    }



}
