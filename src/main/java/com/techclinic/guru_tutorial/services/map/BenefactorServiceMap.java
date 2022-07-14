package com.techclinic.guru_tutorial.services.map;

import com.techclinic.guru_tutorial.model.Benefactor;
import com.techclinic.guru_tutorial.services.BenefactorService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class BenefactorServiceMap extends AbstractMapService<Benefactor, Long> implements BenefactorService{

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
        return super.save(object);
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
