package tn.esprit.springprojectcs.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.springprojectcs.entities.Equipe;
import tn.esprit.springprojectcs.services.IEquipeService;

import java.util.List;

@RestController
@AllArgsConstructor
public class EquipeController {

    IEquipeService equipeService;


    @GetMapping("/afficherEquipes")
    List<Equipe> retrieveAllEquipes(){
        return equipeService.retrieveAllEquipes();
    }

    @PostMapping("/ajouterEquipe")
    Equipe addEquipe(@RequestBody Equipe e){
        return  equipeService.addEquipe(e);
    }

    @PutMapping("/modifierEquipe")
    Equipe modiferEquipe (@RequestBody Equipe e){
        return equipeService.updateEquipe(e);
    }

    @GetMapping("/afficherEquipe/{idEquipe}")
    Equipe retrieveEquipe (@PathVariable Integer idEquipe){
        return equipeService.retrieveEquipe(idEquipe);
    }

    @DeleteMapping("/supprimerEquipe/{idEquipe}")
    void deleteEquipe(@PathVariable Integer idEquipe){
        equipeService.deleteEquipe(idEquipe);
    }
}
