package com.gmail.nesterovich.aleksandr.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Entity
public class Film implements Serializable {

    private static final long serialVersionUID = 5215152801719380555L;
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private String name;
    @Column
    private String genre;
    @Column
    private String country;
    @Column
    private Short duration;
    @Column
    private Short yeaOfIssue;

    public Film() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Short getDuration() {
        return duration;
    }

    public void setDuration(Short duration) {
        this.duration = duration;
    }

    public Short getYeaOfIssue() {
        return yeaOfIssue;
    }

    public void setYeaOfIssue(Short yeaOfIssue) {
        this.yeaOfIssue = yeaOfIssue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film film = (Film) o;
        return Objects.equals(id, film.id) &&
                Objects.equals(name, film.name) &&
                Objects.equals(genre, film.genre) &&
                Objects.equals(country, film.country) &&
                Objects.equals(duration, film.duration) &&
                Objects.equals(yeaOfIssue, film.yeaOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genre, country, duration, yeaOfIssue);
    }
}
