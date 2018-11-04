package com.derekcacciotti.joke.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {


    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl()
    {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();

    }



    @Override
    public String GetJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
