package jt.springframework.jtpetclinic.model;

import java.io.Serializable;

/**
 * Craeted by JT on 9/29/2018
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
