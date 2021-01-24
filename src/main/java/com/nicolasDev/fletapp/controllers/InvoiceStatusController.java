package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.InvoiceStatus;
import com.nicolasDev.fletapp.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class InvoiceStatusController {

    @Autowired
    private InvoiceStatusService invoiceStatusService;

    @GetMapping("/invoiceStatus")
    public String getInvoiceStatusType(Model model){
        List<InvoiceStatus> invoiceStatusList = invoiceStatusService.getInvoiceStatus();
        model.addAttribute("invoiceStatus", invoiceStatusList);
        return "invoiceStatus";
    }

    @PostMapping("/invoiceStatus/addNew")
    public String addNew(InvoiceStatus invoiceStatus){
        invoiceStatusService.saveInvoiceStatus(invoiceStatus);
        return "redirect:/invoiceStatus";
    }

    @RequestMapping(value = "/invoiceStatus/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(InvoiceStatus invoiceStatus){
        invoiceStatusService.updateInvoiceStatus(invoiceStatus);
        return "redirect:/invoiceStatus";
    }

    @RequestMapping(value = "/invoiceStatus/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String update(Integer id){
        invoiceStatusService.deleteInvoiceStatus(id);
        return "redirect:/invoiceStatus";
    }

    @RequestMapping("invoiceStatus/findById")
    @ResponseBody
    public Optional<InvoiceStatus> findById(Integer id){
        return invoiceStatusService.getById(id);
    }
}

