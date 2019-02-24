package com.gmail.nesterovich.aleksandr.dao.impl;

import com.gmail.nesterovich.aleksandr.dao.FilmDao;
import com.gmail.nesterovich.aleksandr.model.Film;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;

import static org.junit.Assert.assertNotNull;

@Transactional
public class FilmDaoImplTest {

    @Autowired
    FilmDao filmDao;

    @Before
    public void setUp() throws Exception {
    }

    @Ignore
    public void save() {
        Film film = new Film();
        film.setName("testNameFilm");
        filmDao.save(film);
        String id = film.getId();
        assertNotNull(id);
    }

    @After
    public void tearDown() throws Exception {
    }
}