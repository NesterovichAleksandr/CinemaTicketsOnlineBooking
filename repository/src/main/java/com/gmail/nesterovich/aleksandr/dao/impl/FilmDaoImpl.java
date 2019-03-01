package com.gmail.nesterovich.aleksandr.dao.impl;

import com.gmail.nesterovich.aleksandr.dao.FilmDao;
import com.gmail.nesterovich.aleksandr.model.Film;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("filmDao")
public class FilmDaoImpl extends BaseDaoImpl<Film, String> implements FilmDao {

    @Autowired
    FilmDaoImpl() {
        super(Film.class);
    }
}
