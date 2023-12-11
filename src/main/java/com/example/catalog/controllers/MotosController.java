package com.example.catalog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class MotosController {
    
    @RequestMapping("/nameDisplay")
    public String hello(@RequestParam("name") String name, Model model )  {
        model.addAttribute("name", name);
        return "test";
    }
}
