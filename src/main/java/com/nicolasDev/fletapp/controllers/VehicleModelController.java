package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.VehicleMake;
import com.nicolasDev.fletapp.models.VehicleModel;
import com.nicolasDev.fletapp.services.VehicleMakeService;
import com.nicolasDev.fletapp.services.VehicleModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleModelController {

    @Autowired
    private VehicleModelService vehicleModelService;

    // Get
    @GetMapping("/vehicleModel")
    public String getVehicleModel(Model model) {
        List<VehicleModel> vehicleModelList = vehicleModelService.getVehicleModel();
        model.addAttribute("vehicleModels", vehicleModelList);
        return "vehicleModel";
    }

    // Post
    @PostMapping("/vehicleModel/addNew")
    public String addNew(VehicleModel vehicleModel) {
        vehicleModelService.save(vehicleModel);
        return "redirect:/vehicleModel";
    }

    // Update
    @RequestMapping(value = "/vehicleModel/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleModel vehicleModel){
        vehicleModelService.update(vehicleModel);
        return "redirect:/vehicleModel";
    }

    // Delete
    @RequestMapping(value = "/vehicleModel/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        vehicleModelService.deleteById(id);
        return "redirect:/vehicleModel";
    }

    @RequestMapping(value = "/vehicleModel/findById")
    @ResponseBody
    public Optional<VehicleModel> findById(Integer id){
        return vehicleModelService.getById(id);
    }




}
