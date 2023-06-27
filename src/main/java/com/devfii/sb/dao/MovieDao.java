package com.devfii.sb.dao;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.devfii.sb.model.Movie;

@Repository
public interface MovieDao extends CrudRepository<Movie, Integer> {//PagingAndSortingRepository<Movie, Integer>{
    //List<Movie> findAll(Pageable pageable);
}
