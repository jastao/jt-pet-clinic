package jt.springframework.jtpetclinic.services.map;

import jt.springframework.jtpetclinic.model.Owner;
import jt.springframework.jtpetclinic.services.CrudService;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/30/2018
 */
public class OwnerMapService extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long> {

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }
}
