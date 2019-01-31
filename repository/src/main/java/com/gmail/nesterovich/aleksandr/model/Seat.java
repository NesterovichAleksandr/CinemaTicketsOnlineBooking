package com.gmail.nesterovich.aleksandr.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Seat {

    private static final long serialVersionUID = 1437298118311194133L;
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private Short row;
    @Column
    private Short place;

    public Seat() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Short getRow() {
        return row;
    }

    public void setRow(Short row) {
        this.row = row;
    }

    public Short getPlace() {
        return place;
    }

    public void setPlace(Short place) {
        this.place = place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seat)) return false;
        Seat seat = (Seat) o;
        return Objects.equals(id, seat.id) &&
                Objects.equals(row, seat.row) &&
                Objects.equals(place, seat.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, row, place);
    }
}
