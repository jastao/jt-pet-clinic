package jt.springframework.jtpetclinic.services.map;

import jt.springframework.jtpetclinic.model.Pet;
import jt.springframework.jtpetclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/30/2018
 */
@Service
public class PersonMapService extends AbstractMapService<Pet, Long> implements PetService {

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
