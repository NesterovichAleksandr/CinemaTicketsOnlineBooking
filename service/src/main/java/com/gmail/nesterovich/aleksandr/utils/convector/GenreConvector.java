package com.gmail.nesterovich.aleksandr.utils.convector;

import com.gmail.nesterovich.aleksandr.model.Genre;
import com.gmail.nesterovich.aleksandr.model.GenreDto;

public class GenreConvector {

    public static Genre convert(GenreDto genreDto){
        Genre genre = new Genre();
        genre.setId(genreDto.getId());
        genre.setGenre(genreDto.getGenre());

        return genre;
    }

    public static GenreDto convert(Genre genre){
        GenreDto genreDto = new GenreDto();
        genreDto.setId(genre.getId());
        genreDto.setGenre(genre.getGenre());

        return genreDto;
    }
}
