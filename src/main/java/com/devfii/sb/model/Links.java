package com.devfii.sb.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Links {
    @Id
    private int movieId;
    private int imdbId;
    private int tmdbId;

    public Links(int movieId, int imdbId, int tmdbId) {
        this.movieId = movieId;
        this.imdbId = imdbId;
        this.tmdbId = tmdbId;
    }

    public int getImdbId() {
        return imdbId;
    }

    public int getTmdbId() {
        return tmdbId;
    }

}