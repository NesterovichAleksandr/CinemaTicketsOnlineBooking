package com.gmail.nesterovich.aleksandr.services.impl;

import com.gmail.nesterovich.aleksandr.dao.FilmDao;
import com.gmail.nesterovich.aleksandr.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FilmServiceImpl<Film, String> implements FilmService<Film, String> {

    FilmDao filmDao;

    @Autowired
    public FilmServiceImpl(FilmDao filmDao) {
        this.filmDao = filmDao;
    }

    @Override
    @Transactional
    public void save(Film entity) {
        filmDao.save((com.gmail.nesterovich.aleksandr.model.Film) entity);
    }
}
