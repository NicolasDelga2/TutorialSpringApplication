package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.VehicleType;
import com.nicolasDev.fletapp.services.VehicleTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehicleTypeController {

    @Autowired
    private VehicleTypeService vehicleTypeService;

    @GetMapping("/vehicleTypes")
    public String getVehicleTypes(Model model) {

        List<VehicleType> vehicleTypeList = vehicleTypeService.getVehicleType();

        model.addAttribute("vehicleTypes", vehicleTypeList);
        return "vehicleType";
    }

    @PostMapping("/vehicleTypes/addNew")
    public String addNew(VehicleType vehicleType) {
        vehicleTypeService.addNew(vehicleType);
        return "redirect:/vehicleTypes";
    }

    @RequestMapping("vehicleTypes/findById")
    @ResponseBody
    public Optional<VehicleType> findById(int id) {
        return vehicleTypeService.findById(id);
    }

    @RequestMapping(value="/vehicleTypes/update", method= {RequestMethod.PUT, RequestMethod.GET})
    public String update(VehicleType vehicleType) {
        vehicleTypeService.update(vehicleType);
        return "redirect:/vehicleTypes";
    }

    @RequestMapping(value="/vehicleTypes/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        vehicleTypeService.delete(id);
        return "redirect:/vehicleTypes";
    }

}
