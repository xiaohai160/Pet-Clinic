package com.example.springpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/","","index","index.html"})
    public String showIndex(Model model){
        return "index";
    }
}
