package com.techclinic.guru_tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/benefactors")
@Controller
public class BenefactorController {

    @RequestMapping({"/index"})
    public String listOfBenefactors(){
        return "benefactors/index";
    }
}
