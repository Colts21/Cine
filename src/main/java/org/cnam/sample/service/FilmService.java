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

    public Film getFilmByName(String name){
        return filmRepository.findByName(name);
    }

    public String deleteFilm(int id){
        filmRepository.deleteById(id);
        return "Film supprimé : " + id;
    }

    public Film updateFilm(Film film){
        Film filmExistant=filmRepository.findById(film.getId()).orElse(null);
        filmExistant.setName(film.getName());
        filmExistant.setGenre(film.getGenre());
        filmExistant.setRealisateur(film.getRealisateur());
        return filmRepository.save(filmExistant);
    }
}

