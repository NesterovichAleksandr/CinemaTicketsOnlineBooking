package com.gmail.nesterovich.aleksandr.model;

import java.sql.Time;
import java.util.Date;

public class SeanceDto {

    private String id;
    private Date date;
    private Time time;

    public SeanceDto() {
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
}
