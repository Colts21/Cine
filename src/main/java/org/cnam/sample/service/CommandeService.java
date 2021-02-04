package org.cnam.sample.service;

import org.cnam.sample.entity.Commande;
import org.cnam.sample.repository.CommandeRepository;
import org.h2.command.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandeService {

    @Autowired
    private CommandeRepository repository;

    public Commande saveCommande(Commande commande) {
        return repository.save(commande);
    }

    public List<Commande> saveCommandes(List<Commande> commandes) {
        return repository.saveAll(commandes);
    }

    public List<Commande> getCommandes() {
        return repository.findAll();
    }

    public Commande getCommandeById(int id) {
        return (Commande) repository.findById(id).orElse(null);
    }

    public Commande getCommandeByName(String name) {
        return (Commande) repository.findByName(name);
    }

    public String deleteCommande(int id){
        repository.deleteById(id);
        return "product removed" +id;
    }

    public Commande updateCommande(Commande commande){
        Commande existingCommande=repository.findById(commande.getId()).orElse(null);
        existingCommande.setName(commande.getName());
        existingCommande.setPrice(commande.getPrice());

        return repository.save(existingCommande);
    }




}