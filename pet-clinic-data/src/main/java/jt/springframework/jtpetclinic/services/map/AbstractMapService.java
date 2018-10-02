package jt.springframework.jtpetclinic.services.map;

import jt.springframework.jtpetclinic.model.BaseEntity;

import java.util.*;

/**
 * Craeted by JT on 9/30/2018
 */
public abstract class AbstractMapService <T extends BaseEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    Optional<T> findById(Long id) {
        return Optional.of(map.get(id));
    }

    T save(T object) {

        if(object != null) {
            if(object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null.");
        }

        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf( entry -> entry.getValue().equals(object));
    }

    void deleteById(Long id) {
        map.remove(id);
    }

    private Long getNextId() {

        Long next_id = null;

        try {
            next_id = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException ex) {
            next_id = 1L;
        }

        return next_id;
    }
}
