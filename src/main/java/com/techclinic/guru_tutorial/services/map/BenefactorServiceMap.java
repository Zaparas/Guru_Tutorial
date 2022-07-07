package com.techclinic.guru_tutorial.services.map;

import com.techclinic.guru_tutorial.model.Benefactor;
import com.techclinic.guru_tutorial.model.Coworker;
import com.techclinic.guru_tutorial.services.CrudService;

import java.util.Set;

public class BenefactorServiceMap extends AbstractMapService<Benefactor, Long> implements CrudService<Benefactor, Long> {

    @Override
    public Set<Benefactor> findAll() {
        return super.findAll();
    }

    @Override
    public Benefactor findByid(Long id) {
        return super.findById(id);
    }

    @Override
    public Benefactor save(Benefactor object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Benefactor object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
