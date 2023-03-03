package com.example.springboot_crudoperation.cd;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class cdController {


    @Autowired
    private cdServices_Imp service;


    @GetMapping("/cd")
    public String getAllCd(Model model){
        try {
            List<cd> listedcds =service.getAll();
            model.addAttribute("listedcd",listedcds);
            return "cd/cds";

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @GetMapping("cd/{id}")
    public String getById(@PathVariable("id")Long id , Model model ){
        try {
            cd cd1 = service.getById(id);
            model.addAttribute("selectedcd",cd1);
            return "cd/cds";
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
