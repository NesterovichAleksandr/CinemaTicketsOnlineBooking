package com.gmail.nesterovich.aleksandr.model;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

@Entity
public class Film implements Serializable {

    private static final long serialVersionUID = 5215152801719380555L;
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id;
    @Column
    private String name;
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private Set<Genre> genres;
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

    public Set<Genre> getGenres() {
        return genres;
    }

    public void setGenres(Set<Genre> genres) {
        this.genres = genres;
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
        if (!(o instanceof Film)) return false;
        Film film = (Film) o;
        return Objects.equals(id, film.id) &&
                Objects.equals(name, film.name) &&
                Objects.equals(genres, film.genres) &&
                Objects.equals(country, film.country) &&
                Objects.equals(duration, film.duration) &&
                Objects.equals(yeaOfIssue, film.yeaOfIssue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, genres, country, duration, yeaOfIssue);
    }
}
