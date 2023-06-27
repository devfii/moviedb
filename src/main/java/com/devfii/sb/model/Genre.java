package com.devfii.sb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Genre {
    @Id
    private int id;
    @Column(nullable = false)
    private String name;

    
    public Genre() {
    }

    public Genre(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Genre [id=" + id + ", name=" + name + "]";
    }

    
    


}