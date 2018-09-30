package jt.springframework.jtpetclinic.services;

import jt.springframework.jtpetclinic.model.Owner;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/29/2018
 */
public interface OwnerService {

    Optional<Owner> findByLastName(String lastName);

    Optional<Owner> findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
