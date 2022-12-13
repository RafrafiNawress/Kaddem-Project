package tn.esprit.springprojectcs.services;

import tn.esprit.springprojectcs.entities.Etudiant;

import java.util.List;


public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);
}
