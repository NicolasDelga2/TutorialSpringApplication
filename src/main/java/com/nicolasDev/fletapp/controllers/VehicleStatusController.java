package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.VehicleStatus;
import com.nicolasDev.fletapp.services.VehicleStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleStatusController {

    @Autowired
    private VehicleStatusService vehicleStatusService;

    @GetMapping("/vehicleStatus")
    public String getVehicleType(Model model){
        List<VehicleStatus> vehicleStatusList = vehicleStatusService.getVehicleStatus();
        model.addAttribute("vehicleStatusList", vehicleStatusList);
        return "vehicleStatus";
    }

    @PostMapping("/vehicleStatus/addNew")
    public String addNew(VehicleStatus vehicleStatus){
        vehicleStatusService.saveVehicleStatus(vehicleStatus);
        return "redirect:/vehicleStatus";
    }

    @RequestMapping(value = "/vehicleStatus/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleStatus vehicleStatus){
        vehicleStatusService.updateVehicleStatus(vehicleStatus);
        return "redirect:/vehicleStatus";
    }

    @RequestMapping(value = "/vehicleStatus/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String update(Integer id){
        vehicleStatusService.deleteVehicleStatus(id);
        return "redirect:/vehicleStatus";
    }

    @RequestMapping("/vehicleStatus/findById")
    @ResponseBody
    public Optional<VehicleStatus> findById(Integer id){
        return vehicleStatusService.getById(id);
    }
}
