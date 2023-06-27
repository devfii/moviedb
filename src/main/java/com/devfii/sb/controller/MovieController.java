package com.devfii.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.devfii.sb.model.Movie;
import com.devfii.sb.service.MovieService;

@Controller
public class MovieController {
    @Autowired
    MovieService mservice;

    @RequestMapping("/movies/{page}")
    public List<Movie> getMovies(@PathVariable("page") int page) {
        if (page == 0) page = 1;
        //Page<Movie> movies = mservice.getMovies(page, 10);
        List<Movie> movies = mservice.getMovies(page, 5);
        System.out.println(movies);
        return movies;
    }
    /*
    @RequestMapping(
        value = "/movies/{id}",
        method = RequestMethod.GET, 
        produces = "application/json")
    public List<Movie> getMoviesById(@PathVariable("id") int  id) {
        List<Movie> movies = null;
        return movies;
    }

    @RequestMapping(
        value = "/movies/{genre}",
        method = RequestMethod.GET, 
        produces = "application/json")
    public List<Movie> getMoviesByGenre(@PathVariable("genre") String  genre) {
        List<Movie> movies = null;
        return movies;
    }
    */
    
}
