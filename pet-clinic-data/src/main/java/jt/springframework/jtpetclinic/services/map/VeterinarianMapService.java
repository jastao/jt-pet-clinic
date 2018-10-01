package jt.springframework.jtpetclinic.services.map;

import jt.springframework.jtpetclinic.model.Veterinarian;
import jt.springframework.jtpetclinic.services.VeterinarianService;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/30/2018
 */
public class VeterinarianMapService extends AbstractMapService<Veterinarian, Long> implements VeterinarianService {

    @Override
    public Set<Veterinarian> findAll() {
        return super.findAll();
    }

    @Override
    public Optional<Veterinarian> findById(Long id) {
        return super.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Veterinarian object) {
        super.delete(object);
    }

    @Override
    public Veterinarian save(Veterinarian object) {
        return super.save(object.getId(), object);
    }
}