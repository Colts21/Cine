package org.cnam.sample.service;

import org.cnam.sample.entity.Film;
import org.cnam.sample.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmService {

    @Autowired
    private FilmRepository filmRepository;

    public Film saveFilm(Film film){
        return filmRepository.save(film);
    }

    public List<Film> saveFilms(List<Film> films){
        return filmRepository.saveAll(films);
    }

    public List<Film> getFilm(){
        return filmRepository.findAll();
    }

    public Film getFilmById(int id){
        return filmRepository.findById(id).orElse(null);
    }
}
