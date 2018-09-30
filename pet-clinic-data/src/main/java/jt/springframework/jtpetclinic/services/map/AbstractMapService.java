package jt.springframework.jtpetclinic.services.map;

import java.util.*;

/**
 * Craeted by JT on 9/30/2018
 */
public abstract class AbstractMapService <T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    Set<T> findAll() {
        return new HashSet<>(map.values());
    }

    Optional<T> findById(ID id) {
        return Optional.of(map.get(id));
    }

    T save(ID id, T object) {
        map.put(id, object);

        return object;
    }

    void delete(T object) {
        map.entrySet().removeIf( entry -> entry.getValue().equals(object));
    }

    void deleteById(ID id) {
        map.remove(id);
    }
}
