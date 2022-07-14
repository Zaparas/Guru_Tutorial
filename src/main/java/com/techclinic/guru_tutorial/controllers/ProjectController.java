package com.techclinic.guru_tutorial.controllers;

import com.techclinic.guru_tutorial.services.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/projects")
@Controller
public class ProjectController {

    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @RequestMapping({"", "/","/index","list"})
    public String listOfProjects(Model model){
        model.addAttribute("projects",projectService.findAll());
        return "projects/index";
    }
}
