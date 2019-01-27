package com.gmail.nesterovich.aleksandr.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Cinema implements Serializable {

    private static final long serialVersionUID = 3956463398624664851L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String name;
    @Column
    private String address;

    public Cinema() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cinema cinema = (Cinema) o;
        return Objects.equals(id, cinema.id) &&
                Objects.equals(name, cinema.name) &&
                Objects.equals(address, cinema.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }
}
