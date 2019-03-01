package com.gmail.nesterovich.aleksandr.services;

import com.gmail.nesterovich.aleksandr.model.FilmDto;

import java.util.List;

public interface FilmService {

    void save(FilmDto filmDto);

    List findAll();
}
