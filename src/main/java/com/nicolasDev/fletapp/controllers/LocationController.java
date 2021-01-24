package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.Country;
import com.nicolasDev.fletapp.models.Location;
import com.nicolasDev.fletapp.models.State;
import com.nicolasDev.fletapp.services.CountryService;
import com.nicolasDev.fletapp.services.LocationService;
import com.nicolasDev.fletapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;
    @Autowired
    private CountryService countryService;
    @Autowired
    private StateService stateService;



    // Get
    @GetMapping("/location")
    public String getLocation(Model model){
        List<Location> locationList = locationService.getLocations();
        List<Country> countryList = countryService.getCountries();
        List<State> stateList = stateService.getStates();

        model.addAttribute("countries",countryList);
        model.addAttribute("states",stateList);
        model.addAttribute("locations",locationList);
        return "location";
    }

    // Add New
    @PostMapping("/location/addNew")
    public String addNew(Location location){
        locationService.addNew(location);
        return "redirect:/location";
    }
    // Update Location
    @RequestMapping(value = "/location/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Location location) {
        locationService.update(location);
        return "redirect:/location";

    }

    // Delete Location
    @RequestMapping(value = "/location/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        locationService.delete(id);
        return "redirect:/location";
    }


    @RequestMapping("/location/findById")
    @ResponseBody
    public Optional<Location> findById(Integer id){
        return locationService.findById(id);
    }





}
