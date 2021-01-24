package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.Supplier;
import com.nicolasDev.fletapp.services.CountryService;
import com.nicolasDev.fletapp.services.StateService;
import com.nicolasDev.fletapp.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class SupplierController {

    @Autowired private SupplierService supplierService;
    @Autowired private StateService stateService;
    @Autowired private CountryService countryService;

    @GetMapping("/supplier")
    public String getSupplier(Model model){
        model.addAttribute("suppliers",supplierService.getSuppliers());
        model.addAttribute("states",stateService.getStates());
        model.addAttribute("countries",countryService.getCountries());
        return "supplier";
    }

    @PostMapping("/supplier/addNew")
    public String addNew(Supplier supplier){
        supplierService.save(supplier);
        return "redirect:/supplier";
    }

    @RequestMapping(value = "/supplier/update",method = {RequestMethod.PUT,RequestMethod.GET})
    public String update(Supplier supplier){
        supplierService.update(supplier);
        return "redirect:/supplier";
    }

    @RequestMapping(value = "/supplier/delete",method = {RequestMethod.DELETE,RequestMethod.GET})
    public String delete(Integer id){
        supplierService.delete(id);
        return "redirect:/supplier";
    }

    @RequestMapping("/supplier/findById")
    @ResponseBody
    public Optional<Supplier> findById(Integer id){
        return supplierService.getById(id);
    }
}
