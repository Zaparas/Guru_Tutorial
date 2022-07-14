package com.techclinic.guru_tutorial.controllers;

import com.techclinic.guru_tutorial.model.Benefactor;
import com.techclinic.guru_tutorial.services.BenefactorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/benefactors")
@Controller
public class BenefactorController {

    private final BenefactorService benefactorService;

    public BenefactorController(BenefactorService benefactorService) {
        this.benefactorService = benefactorService;
    }

    @RequestMapping({"","/","/index"})
    public String listOfBenefactors(Model model){
        model.addAttribute("benefactors",benefactorService.findAll());
        return "benefactors/index";
    }
}
