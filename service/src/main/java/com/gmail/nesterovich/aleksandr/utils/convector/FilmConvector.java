package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.Film;
import com.gmail.nesterovich.aleksandr.model.FilmDto;

public class FilmConvector {

    private FilmConvector() {
    }

    public static Film convert(FilmDto filmDto){
        Film film = new Film();
        film.setId(filmDto.getId());
        film.setName(filmDto.getName());
        film.setGenre(filmDto.getGenre());
        film.setCountry(filmDto.getCountry());
        film.setDuration(filmDto.getDuration());
        film.setYearOfIssue(filmDto.getYearOfIssue());

        return film;
    }

    public static FilmDto convert(Film film){
        FilmDto filmDto = new FilmDto();
        filmDto.setId(film.getId());
        filmDto.setName(film.getName());
        filmDto.setGenre(film.getGenre());
        filmDto.setCountry(film.getCountry());
        filmDto.setDuration(film.getDuration());
        filmDto.setYearOfIssue(film.getYearOfIssue());

        return filmDto;
    }
}
