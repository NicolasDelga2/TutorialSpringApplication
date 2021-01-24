package com.nicolasDev.fletapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMaintenenceController {

    @GetMapping("/vehicleMaintenence")
    public String getVehicleMaintenence(){
        return "vehicleMaintenence";
    }
}
