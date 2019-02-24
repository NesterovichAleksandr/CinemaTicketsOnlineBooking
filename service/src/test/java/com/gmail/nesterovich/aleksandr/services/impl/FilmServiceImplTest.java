package com.gmail.nesterovich.aleksandr.services.impl;

import com.gmail.nesterovich.aleksandr.model.Film;
import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertNotNull;

@Transactional
public class FilmServiceImplTest {

    /*@Autowired
    FilmService filmService;*/

    @Before
    public void setUp() throws Exception {
    }

    @Ignore
    public void save() {
        Film film = new Film();
        film.setName("testServiceNameFilm");
        //filmService.save(film);
        String id = film.getId();
        assertNotNull(id);
    }

    @After
    public void tearDown() throws Exception {
    }
}