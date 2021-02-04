package org.cnam.sample.repository;

import org.cnam.sample.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommandeRepository extends JpaRepository<Commande,Integer> {
    Commande findByName(String name);
}
