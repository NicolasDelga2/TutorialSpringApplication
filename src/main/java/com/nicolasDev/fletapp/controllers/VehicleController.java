package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.Vehicle;
import com.nicolasDev.fletapp.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class VehicleController {

    @Autowired private VehicleService vehicleService;
    @Autowired private VehicleTypeService vehicleTypeService;
    @Autowired private VehicleMakeService vehicleMakeService;
    @Autowired private VehicleModelService vehicleModelService;
    @Autowired private LocationService locationService;
    @Autowired private VehicleStatusService vehicleStatusService;
    @Autowired private EmployeeService employeeService;

    @GetMapping("/vehicle")
    public String getVehicle(Model model){
        model.addAttribute("vehicles",vehicleService.getVehicles());
        model.addAttribute("vehiclesTypes",vehicleTypeService.getVehicleType());
        model.addAttribute("vehicleMakes", vehicleMakeService.getVehiclesMake());
        model.addAttribute("vehicleModels", vehicleModelService.getVehicleModel());
        model.addAttribute("locations",locationService.getLocations());
        model.addAttribute("vehicleStatus", vehicleStatusService.getVehicleStatus());
        model.addAttribute("employees", employeeService.getEmployees());

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
