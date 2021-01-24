package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.Country;
import com.nicolasDev.fletapp.models.State;
import com.nicolasDev.fletapp.services.CountryService;
import com.nicolasDev.fletapp.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class StateController {

    @Autowired
    private StateService stateService;

    @Autowired
    private CountryService countryService;



    @GetMapping("/states")
    public String getStates(Model model){
        List<State> stateList = stateService.getStates();
        model.addAttribute("state",stateList);

        List<Country> countryList = countryService.getCountries();
        model.addAttribute("countries",countryList);
        return "state";
    }

    @PostMapping("/states/addNew")
    public String addNew(State state){
        stateService.addNew(state);
        return "redirect:/states";
    }

    @RequestMapping("/states/findById")
    @ResponseBody
    public Optional<State> findById(Integer id){
        return stateService.findById(id);
    }

    @RequestMapping(value = "states/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateState(State state){
        stateService.update(state);
        return "redirect:/states";
    }

    @RequestMapping(value = "states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteState(Integer id){
        stateService.delete(id);
        return "redirect:/states";
    }



}
