package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.VehicleMaintenance;
import com.nicolasDev.fletapp.services.SupplierService;
import com.nicolasDev.fletapp.services.VehicleMaintenenceService;
import com.nicolasDev.fletapp.services.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleMaintenenceController {

    @Autowired
    private VehicleMaintenenceService vehicleMaintenenceService;

    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private SupplierService supplierService;

    @GetMapping("/vehicleMaintenence")
    public String getVehicleMaintenence(Model model){
        model.addAttribute("vehicles" , vehicleService.getVehicles());
        model.addAttribute("suppliers", supplierService.getSuppliers());
        model.addAttribute("vehiclesMaintenances", vehicleMaintenenceService.getVehicleMaintenance());
        return "vehicleMaintenence";
    }

    @PostMapping("/vehicleMaintenence/addNew")
    public String addNew(VehicleMaintenance vehicleMaintenance){
        vehicleMaintenenceService.addNew(vehicleMaintenance);
        return "redirect:/vehicleMaintenence";
    }

    @RequestMapping("/vehicleMaintenence/findById")
    @ResponseBody
    public Optional<VehicleMaintenance> findById(Integer id){
        return vehicleMaintenenceService.findById(id);
    }

    @RequestMapping(value = "/vehicleMaintenence/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleMaintenance vehicleMaintenence){
        vehicleMaintenenceService.update(vehicleMaintenence);
        return "redirect:/vehicleMaintenence";
    }

    @RequestMapping(value = "/vehicleMaintenence/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        vehicleMaintenenceService.delete(id);
        return "redirect:/vehicleMaintenence";
    }
}
