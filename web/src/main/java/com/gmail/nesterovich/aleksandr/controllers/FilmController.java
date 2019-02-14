package com.gmail.nesterovich.aleksandr.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class FilmController {

    @RequestMapping(method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {

        model.addAttribute("message", "Spring MVC - Hello World");
        return "hello";
    }

    @RequestMapping(value = {"/film"}, method = RequestMethod.GET)
    public String showWelcomePage() {
        return "film";
    }
}
