package com.gmail.nesterovich.aleksandr.model;

public class CountryDto {

    private Long id;
    private String country;

    public CountryDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
