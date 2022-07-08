package com.techclinic.guru_tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoworkerController {

    @RequestMapping({"/coworkers" , "/coworkers/index" ,"/coworkers/index.html"})
    public String listCoworkers(){
        return "coworkers/index";
    }
}
