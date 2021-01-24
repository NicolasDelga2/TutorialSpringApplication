package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.EmployeeType;
import com.nicolasDev.fletapp.services.EmployeeTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class EmployeeTypeController {

    @Autowired
    private EmployeeTypeService employeeTypeService;

    @GetMapping("/employeeType")
    public String getEmployeeType(Model model){
        List<EmployeeType> employeeTypeList = employeeTypeService.getEmployeeType();
        model.addAttribute("employeeType", employeeTypeList);
        return "employeeType";
    }

    @PostMapping("/employeeType/addNew")
    public String addNew(EmployeeType employeeType){
        employeeTypeService.saveEmployeeType(employeeType);
        return "redirect:/employeeType";
    }

    @RequestMapping(value = "/employeeType/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(EmployeeType employeeType){
        employeeTypeService.updateEmployeeType(employeeType);
        return "redirect:/employeeType";
    }

    @RequestMapping(value = "/employeeType/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id){
        employeeTypeService.deleteEmployeeType(id);
        return "redirect:/employeeType";
    }

    @RequestMapping("/employeeType/findById")
    @ResponseBody
    public Optional<EmployeeType> findById(Integer id){
        return employeeTypeService.getById(id);
    }
}
