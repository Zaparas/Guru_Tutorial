package com.techclinic.guru_tutorial.services.map;

import com.techclinic.guru_tutorial.model.Project;
import com.techclinic.guru_tutorial.services.ProjectService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class ProjectServiceMap extends AbstractMapService<Project, Long> implements ProjectService {

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
        return super.save(object);
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
