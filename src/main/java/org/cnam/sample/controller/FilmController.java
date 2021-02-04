package org.cnam.sample.controller;

import org.cnam.sample.entity.Film;
import org.cnam.sample.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;

    @PostMapping("/addFilm")
    public Film addFilm(@RequestBody Film film){
        return filmService.saveFilm(film);
    }

    @PostMapping("/addFilms")
    public List<Film> addFilm(@RequestBody List<Film> films){
        return filmService.saveFilms(films);
    }

    @GetMapping("/film")
    public List<Film> findAllFilms(){
        return filmService.getFilm();
    }

    @GetMapping("/film/{id}")
    public Film findFilmById(@PathVariable int id){
        return filmService.getFilmById(id);
    }

    @GetMapping("/film/{name}")
    public Film findFilmByName(@PathVariable String name){
        return filmService.getFilmByName(name);
    }

    @PutMapping("/update")
    public Film updateFilm(@RequestBody Film film){
        return filmService.updateFilm(film);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteFilm(@PathVariable int id){
        return filmService.deleteFilm(id);
    }
}
