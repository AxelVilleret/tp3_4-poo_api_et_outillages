package com.poo.tp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

    @GetMapping("/adresse")
    public String showForm() {
        return "form";
    }
    
}
