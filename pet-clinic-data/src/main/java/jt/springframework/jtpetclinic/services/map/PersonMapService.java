package jt.springframework.jtpetclinic.services.map;

import jt.springframework.jtpetclinic.model.Pet;
import jt.springframework.jtpetclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/30/2018
 */
public class PersonMapService extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Pet> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}