package com.techclinic.guru_tutorial.services.map;

import com.techclinic.guru_tutorial.model.Project;
import com.techclinic.guru_tutorial.services.CrudService;

import java.util.Set;

public class ProjectServiceMap extends AbstractMapService<Project, Long> implements CrudService<Project, Long> {

    @Override
    public Set<Project> findAll() {
        return super.findAll();
    }

    @Override
    public Project findByid(Long id) {
        return super.findById(id);
    }

    @Override
    public Project save(Project object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Project object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
