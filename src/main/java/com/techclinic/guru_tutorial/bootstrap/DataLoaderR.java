package com.techclinic.guru_tutorial.bootstrap;

import com.techclinic.guru_tutorial.model.Benefactor;
import com.techclinic.guru_tutorial.model.Coworker;
import com.techclinic.guru_tutorial.model.Project;
import com.techclinic.guru_tutorial.services.BenefactorService;
import com.techclinic.guru_tutorial.services.CoworkerService;
import com.techclinic.guru_tutorial.services.ProjectService;
import com.techclinic.guru_tutorial.services.map.BenefactorServiceMap;
import com.techclinic.guru_tutorial.services.map.CoworkerServiceMap;
import com.techclinic.guru_tutorial.services.map.ProjectServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoaderR implements CommandLineRunner{

    private final BenefactorService benefactorService;
    private final ProjectService projectService;
    private final CoworkerService coworkerService;

    public DataLoaderR(BenefactorService benefactorService, ProjectService projectService, CoworkerService coworkerService) {
        this.benefactorService = benefactorService;
        this.projectService = projectService;
        this.coworkerService = coworkerService;
    }

    @Override
    public void run(String... args) throws Exception {


        System.out.println("--------Data initialization \"R\" in progress");

        Coworker coworker1 = new Coworker();
        coworker1.setFirstName("Paschalis");
        coworker1.setLastName("Zap");
        coworker1.setSpecialty("Coding");

        coworkerService.save(coworker1);

        Coworker coworker2 = new Coworker();
        coworker2.setFirstName("Alex");
        coworker2.setLastName("Pap");
        coworker2.setSpecialty("Manager");

        coworkerService.save(coworker2);

        System.out.println(" Loaded Coworkers...");


        Benefactor benefactor1 = new Benefactor();
        benefactor1.setFirstName("InfoTeam");
        benefactor1.setLastName("Greece");
        benefactor1.setType("Company");
        benefactor1.setContactNumber(100100100);

        benefactorService.save(benefactor1);

        Benefactor benefactor2 = new Benefactor();
        benefactor2.setFirstName("Pan");
        benefactor2.setLastName("Zap");
        benefactor2.setType("Person");
        benefactor2.setContactNumber(100100101);

        benefactorService.save(benefactor2);

        System.out.println(" Loaded benefactors...");

        Project project1 = new Project();
        project1.setName("Spring Tutorial");
        project1.setEntryDate(LocalDate.of(2022,6,1));

        projectService.save(project1);

        Project project2 = new Project();
        project2.setName("Improve All");
        project2.setEntryDate(LocalDate.of(0,1,1));

        projectService.save(project2);

        System.out.println(" Loaded Projects...");



    }
}
