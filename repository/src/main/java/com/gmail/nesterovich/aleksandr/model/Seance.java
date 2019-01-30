package com.gmail.nesterovich.aleksandr.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Time;
import java.util.Date;
import java.util.Objects;

@Entity
public class Seance {

    private static final long serialVersionUID = 3637080968054916490L;
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private Date date;
    @Column
    private Time time;

    public Seance() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seance)) return false;
        Seance seance = (Seance) o;
        return Objects.equals(id, seance.id) &&
                Objects.equals(date, seance.date) &&
                Objects.equals(time, seance.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, time);
    }
}
