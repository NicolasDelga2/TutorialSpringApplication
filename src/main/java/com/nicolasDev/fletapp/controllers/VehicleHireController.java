package com.nicolasDev.fletapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleHireController {
    @GetMapping("vehicleHire")
    public String getVehicleHire(){
        return "vehicleHire";
    }
}
