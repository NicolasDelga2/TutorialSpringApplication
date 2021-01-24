package com.nicolasDev.fletapp.controllers;


import com.nicolasDev.fletapp.models.Invoice;
import com.nicolasDev.fletapp.services.ClientService;
import com.nicolasDev.fletapp.services.InvoiceService;
import com.nicolasDev.fletapp.services.InvoiceStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;
    @Autowired
    private ClientService clientService;
    @Autowired
    private InvoiceStatusService invoiceStatusService;

    @GetMapping("/invoice")
    public String getStates(Model model){
        model.addAttribute("invoiceStatus",invoiceStatusService.getInvoiceStatus());
        model.addAttribute("clients",clientService.getClients());
        model.addAttribute("invoices",invoiceService.getInvoices());
        return "invoice";
    }

    @PostMapping("/invoice/addNew")
    public String addNew(Invoice invoice){
        invoiceService.addNew(invoice);
        return "redirect:/invoice";
    }

    @RequestMapping("/invoice/findById")
    @ResponseBody
    public Optional<Invoice> invoice(Integer id){
        return invoiceService.findById(id);
    }

    @RequestMapping(value = "invoice/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String updateState(Invoice invoice){
        invoiceService.update(invoice);
        return "redirect:/invoice";
    }

    @RequestMapping(value = "invoice/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String deleteState(Integer id){
        invoiceService.delete(id);
        return "redirect:/invoice";
    }

}
