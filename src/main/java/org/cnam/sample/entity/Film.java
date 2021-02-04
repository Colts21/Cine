package org.cnam.sample.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Film")
public class Film {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String genre;
    private String realisateur;

    public Film(int id, String name, String genre, String realisateur) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.realisateur = realisateur;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }
}
