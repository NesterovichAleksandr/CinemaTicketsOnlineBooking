package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.Film;
import com.gmail.nesterovich.aleksandr.dto.FilmDto;

public class FilmConvector {

    private FilmConvector() {
    }

    public static Film convert(FilmDto filmDto){
        Film film = new Film();
        film.setId(filmDto.getId());
        film.setName(filmDto.getName());
        film.setDuration(filmDto.getDuration());
        film.setYeaOfIssue(filmDto.getYeaOfIssue());

        return film;
    }
}
