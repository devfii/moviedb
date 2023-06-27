package com.devfii.sb.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.devfii.sb.dao.MovieDao;
import com.devfii.sb.model.Movie;

@Service
public class MovieService {
    @Autowired
	MovieDao repo;

    public List<Movie> getMovies(int page, int size) {

        return (List<Movie>) repo.findAll();
        //repo.findAll(PageRequest.of(page, size, Sort.by("original_title")));
    }
    
}
