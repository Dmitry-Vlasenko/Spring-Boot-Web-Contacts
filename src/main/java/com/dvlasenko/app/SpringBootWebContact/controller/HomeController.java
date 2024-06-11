package com.dvlasenko.app.SpringBootWebContact.controller;

import com.dvlasenko.app.SpringBootWebContact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    ContactService contactService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("contacts", contactService.getContact());
        return "home";
    }
}
