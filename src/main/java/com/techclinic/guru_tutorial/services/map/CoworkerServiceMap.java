package com.techclinic.guru_tutorial.services.map;

import com.techclinic.guru_tutorial.model.Coworker;
import com.techclinic.guru_tutorial.services.CoworkerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class CoworkerServiceMap extends AbstractMapService<Coworker, Long> implements CoworkerService {

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
        return super.save(object);
    }

    @Override
    public void delete(Coworker object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Coworker findByLastName(String lastName) {
        return null;
    }
}
