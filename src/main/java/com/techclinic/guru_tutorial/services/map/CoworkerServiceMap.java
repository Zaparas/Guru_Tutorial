package com.techclinic.guru_tutorial.services.map;

import com.techclinic.guru_tutorial.model.Coworker;
import com.techclinic.guru_tutorial.services.CrudService;

import java.util.Set;

public class CoworkerServiceMap extends AbstractMapService<Coworker, Long> implements CrudService<Coworker, Long> {

    @Override
    public Set<Coworker> findAll() {
        return super.findAll();
    }

    @Override
    public Coworker findByid(Long id) {
        return super.findById(id);
    }

    @Override
    public Coworker save(Coworker object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Coworker object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
