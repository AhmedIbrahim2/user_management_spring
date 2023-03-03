package com.example.springboot_crudoperation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class maincontroller {


    @GetMapping("")
    public String showHomePage(){
        System.out.print("Main Controller");
        return "index";
    }

}
