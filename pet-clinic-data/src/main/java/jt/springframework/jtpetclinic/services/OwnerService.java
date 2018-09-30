package jt.springframework.jtpetclinic.services;

import jt.springframework.jtpetclinic.model.Owner;

import java.util.Optional;

/**
 * Craeted by JT on 9/29/2018
 */
public interface OwnerService extends CrudService<Owner, Long>{

    Optional<Owner> findByLastName(String lastName);

}
