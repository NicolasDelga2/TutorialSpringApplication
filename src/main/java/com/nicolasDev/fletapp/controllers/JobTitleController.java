package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.JobTitle;
import com.nicolasDev.fletapp.services.JobTitleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class JobTitleController {

    @Autowired
    private JobTitleService jobTitleService;

    @GetMapping("/jobTitle")
    public String getVehicleType(Model model){
        List<JobTitle> employeeTypeList = jobTitleService.getJobTitles();
        model.addAttribute("jobTitle", employeeTypeList);
        return "jobTitle";
    }

    @PostMapping("/jobTitle/addNew")
    public String addNew(JobTitle jobTitle){
        jobTitleService.saveJobTitle(jobTitle);
        return "redirect:/jobTitle";
    }

    @RequestMapping(value = "/jobTitle/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(JobTitle jobTitle){
        jobTitleService.updateJobTitle(jobTitle);
        return "redirect:/jobTitle";
    }

    @RequestMapping(value = "/jobTitle/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String update(Integer id){
        jobTitleService.deleteJobTitle(id);
        return "redirect:/jobTitle";
    }

    @RequestMapping("/jobTitle/findById")
    @ResponseBody
    public Optional<JobTitle> findById(Integer id){
        return jobTitleService.findById(id);
    }
}
