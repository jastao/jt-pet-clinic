package jt.springframework.jtpetclinic.services;

import jt.springframework.jtpetclinic.model.Veterinarian;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/29/2018
 */
public interface VeterinarianService {

    Optional<Veterinarian> findById(Long id);

    Veterinarian save(Veterinarian vet);

    Set<Veterinarian> findAll();
}
