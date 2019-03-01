package com.gmail.nesterovich.aleksandr.controllers;

import com.gmail.nesterovich.aleksandr.services.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @RequestMapping(method = RequestMethod.GET)
    public String filmList(ModelMap model) {
        model.addAttribute("films", filmService.findAll());
        return "film";
    }
}
