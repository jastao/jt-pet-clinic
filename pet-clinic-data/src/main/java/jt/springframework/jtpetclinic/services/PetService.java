package jt.springframework.jtpetclinic.services;

import jt.springframework.jtpetclinic.model.Pet;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/29/2018
 */
public interface PetService {

    Optional<Pet> findById(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}
