package com.gmail.nesterovich.aleksandr.model;

public class FilmDto {

    private String id;
    private String name;
    private String genre;
    private String country;
    private Short duration;
    private Short yearOfIssue;

    public FilmDto() {
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

    public Short getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(Short yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
