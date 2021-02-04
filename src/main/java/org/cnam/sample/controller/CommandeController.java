package org.cnam.sample.controller;

import org.cnam.sample.entity.Commande;
import org.cnam.sample.service.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommandeController {

    @Autowired
    private CommandeService service;

    @PostMapping("/addCommande")
    public Commande addCommande(@RequestBody Commande commande){
        return service.saveCommande(commande);
    }
    @PostMapping("/addCommandes")
    public List<Commande> addCommandes(@RequestBody List<Commande> commandes){
        return service.saveCommandes(commandes);
    }
    @GetMapping("/Commandes")
    public List<Commande> findAllCommands(){
        return service.getCommandes();
    }
    @GetMapping("/Commande/{id}")
    public Commande findCommandeById(@PathVariable int id){
        return service.getCommandeById(id);
    }

    @GetMapping("/Commande/{name}")
    public Commande findCommandeByName(@PathVariable String name){
        return service.getCommandeByName(name);
    }

    @PutMapping("/update")
    public Commande updateCommande(@RequestBody Commande commande){
        return service.updateCommande(commande);
    }
    @DeleteMapping("/delete/{id)")
    public String deleteProduct(int id){
        return service.deleteCommande(id);
    }


}
