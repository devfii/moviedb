package com.devfii.sb.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
public class Movie {
    @Id
    private long id;
    private String adult;		
    private String originalTitle;

    public Movie(long id, String adult, String originalTitle) {
        this.id = id;
        this.adult = adult;
        //this.genres = genres;
        this.originalTitle = originalTitle;
    }

    public long getId() {
        return id;
    }

    public String isAdult() {
        return adult;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }	

    
    
}