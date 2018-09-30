package jt.springframework.jtpetclinic.services;

import java.util.Optional;
import java.util.Set;

/**
 * Craeted by JT on 9/30/2018
 */
public interface CrudService<T, ID> {

    Set<T> findAll();

    Optional<T> findById(Long id);

    T save(T object);

    void delete(T object);

    void deleteById(Long id);
}
