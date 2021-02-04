package org.cnam.sample.repository;

import org.cnam.sample.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends JpaRepository<Film,Integer> {
    Film findByName(String name);
}
