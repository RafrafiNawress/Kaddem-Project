package tn.esprit.springprojectcs.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectcs.entities.Etudiant;
import tn.esprit.springprojectcs.repository.EtudiantRepositoy;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

   // @Autowired // pour injecter un bean dans un autre bean
    EtudiantRepositoy etudiantRepositoy;


    @Override
    public List<Etudiant> retrieveAllEtudiants() {

        return etudiantRepositoy.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {

        return etudiantRepositoy.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepositoy.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {

        return etudiantRepositoy.findById(idEtudiant).orElse(null);
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
        etudiantRepositoy.deleteById(idEtudiant);
    }
}
