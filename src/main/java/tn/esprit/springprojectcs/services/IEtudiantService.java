package tn.esprit.springprojectcs.services;

import tn.esprit.springprojectcs.entities.Contrat;
import tn.esprit.springprojectcs.entities.Etudiant;

import java.util.List;


public interface IEtudiantService {

    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);

    public void assignEtudiantToDepartement (Integer etudiantId, Integer departementId) ;
    Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer
            idEquipe);

    Contrat affectContratToEtudiant (Contrat ce, String nomE, String prenomE);
}
