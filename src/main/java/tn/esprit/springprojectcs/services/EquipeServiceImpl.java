package tn.esprit.springprojectcs.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectcs.entities.Equipe;
import tn.esprit.springprojectcs.repository.EquipeRepository;

import java.util.List;


@Service
@AllArgsConstructor
public class EquipeServiceImpl implements  IEquipeService{
    //@Autowired
    EquipeRepository equipeRepository;

        @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).orElse(null);
    }

    @Override
    public void deleteEquipe(Integer idEquipe) {
        equipeRepository.deleteById(idEquipe);
        System.out.println("equipe supprimé");
    }
}
