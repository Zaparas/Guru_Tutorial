package com.techclinic.guru_tutorial.services;

import com.techclinic.guru_tutorial.model.Coworker;

import java.util.Set;

public interface CoworkerService extends CrudService<Coworker, Long>{

    Coworker findByLastName(String lastName);

}
