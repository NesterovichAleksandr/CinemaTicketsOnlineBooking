package com.gmail.nesterovich.aleksandr.services.impl;

import com.gmail.nesterovich.aleksandr.dao.FilmDao;
import com.gmail.nesterovich.aleksandr.model.Film;
import com.gmail.nesterovich.aleksandr.model.FilmDto;
import com.gmail.nesterovich.aleksandr.services.FilmService;
import com.gmail.nesterovich.aleksandr.utils.convector.FilmConvector;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmServiceImpl implements FilmService {

    FilmDao filmDao;

    @Autowired
    public FilmServiceImpl(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @Override
    @Transactional
    public void save(FilmDto filmDto) {
        Film film = FilmConvector.convert(filmDto);
        filmDao.save(film);
    }
}
