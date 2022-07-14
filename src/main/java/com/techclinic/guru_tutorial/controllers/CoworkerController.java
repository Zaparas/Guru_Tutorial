package com.techclinic.guru_tutorial.controllers;

import com.techclinic.guru_tutorial.services.CoworkerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/coworkers"})
@Controller
public class CoworkerController {

    private final CoworkerService coworkerService;

    public CoworkerController(CoworkerService coworkerService) {
        this.coworkerService = coworkerService;
    }

    @RequestMapping({"","/" , "/index" ,"/index.html"})
    public String listCoworkers(Model model){
        model.addAttribute("coworkers",coworkerService.findAll());
        return "coworkers/index";
    }
}
