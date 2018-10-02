package jt.springframework.jtpetclinic.services.map;

import jt.springframework.jtpetclinic.model.Owner;
import jt.springframework.jtpetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/30/2018
 */
@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

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

    @Override
    public Optional<Owner> findByLastName(String lastName) {
        return Optional.empty();
    }
}
