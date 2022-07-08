package com.techclinic.guru_tutorial.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/projects")
@Controller
public class ProjectController {

    @RequestMapping({"", "/","/index","list"})
    public String listOfProjects(){
        return "projects/index";
    }
}
