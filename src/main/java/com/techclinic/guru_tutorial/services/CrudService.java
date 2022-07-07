package com.techclinic.guru_tutorial.services;

import com.techclinic.guru_tutorial.model.Project;

import java.util.Set;

public interface CrudService <T, ID>{

    Set<T> findAll();

    T findByid(ID id);

    T save(T object);

    void delete(T object);

    void deleteById(ID id);

}
