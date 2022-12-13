package tn.esprit.springprojectcs.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprojectcs.entities.Etudiant;
import tn.esprit.springprojectcs.services.EtudiantServiceImpl;
import tn.esprit.springprojectcs.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantController {

    IEtudiantService etudiantService;

    @GetMapping("/afficherAllEtudiant")
    public List<Etudiant> retrieveAllEtudiants(){

        return etudiantService.retrieveAllEtudiants();
    }

    @PostMapping("/ajouterEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){

        return etudiantService.addEtudiant(e);
    }

    @DeleteMapping("/supprimerEtudiant/{idEtudiant}")
    public void removeEtudiant(@PathVariable Integer idEtudiant){

        etudiantService.removeEtudiant(idEtudiant);
    }



}
