package com.gmail.nesterovich.aleksandr.dto;

public class FilmDto {

    private String id;
    private String name;
    private Short duration;
    private Short yeaOfIssue;

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
}
