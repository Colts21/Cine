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

}
