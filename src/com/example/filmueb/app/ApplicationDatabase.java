package com.example.filmueb.app;

import com.example.filmueb.model.Actor;
import com.example.filmueb.model.Film;
import com.example.filmueb.model.Series;

import java.util.ArrayList;
import java.util.List;

public class ApplicationDatabase {
    ArrayList<Film> films;
    ArrayList<Actor> actors;
    ArrayList<Series> serieses;

    public ApplicationDatabase(){
        films = new ArrayList<>();
        actors = new ArrayList<>();
        serieses = new ArrayList<>();
    }

    public List<Film> getFilms(){
        return films;
    }

    public List<Actor> getActors(){
        return actors;
    }

    public List<Series> getSeries(){
        return serieses;
    }



}
