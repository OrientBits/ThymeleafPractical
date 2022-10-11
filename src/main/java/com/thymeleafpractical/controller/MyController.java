package com.thymeleafpractical.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@Controller
public class MyController {

    //http://localhost:8080/about

    //@GetMapping("/about")
    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(Model model) {
        System.out.println("Inside about handler...");
        //putting data in model
        model.addAttribute("name","Ramshek Rana");
        model.addAttribute("currentDate", new Date().toLocaleString());
        return "about";
    }

}
