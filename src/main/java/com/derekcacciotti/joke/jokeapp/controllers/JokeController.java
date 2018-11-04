package com.derekcacciotti.joke.jokeapp.controllers;

import com.derekcacciotti.joke.jokeapp.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class JokeController {

    private JokeService jokeService;

@Autowired
    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

@RequestMapping({"/", ""})
    public String ShowJoke(Model model)
    {
        model.addAttribute("joke",jokeService.GetJoke());
        return "chucknorris";
    }
}
