package com.nicolasDev.fletapp.controllers;

import com.nicolasDev.fletapp.models.Client;
import com.nicolasDev.fletapp.models.Contact;
import com.nicolasDev.fletapp.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class ContactController {

    @Autowired
    private ContactService contactService;

    @GetMapping("/contact")
    public String getClient(Model model) {
        List<Contact> contacts = contactService.getClients();
        model.addAttribute("contacts", contacts);
        return "contact";
    }

    @PostMapping("/contact/addNew")
    public String save(Contact contact) {
        contactService.save(contact);
        return "redirect:/contact";
    }

    @RequestMapping("contact/findById")
    @ResponseBody
    public Optional<Contact> getById(Integer id) {
        return contactService.getById(id);
    }

    @RequestMapping(value = "contact/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(Contact contact) {
        contactService.save(contact);
        return "redirect:/contact";
    }

    @RequestMapping(value = "contact/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer id) {
        contactService.delete(id);
        return "redirect:/client";
    }

}