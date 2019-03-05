package com.gmail.nesterovich.aleksandr.model;

public class SeatDto {

    private String id;
    private Short row;
    private Short place;

    public SeatDto() {
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
}
