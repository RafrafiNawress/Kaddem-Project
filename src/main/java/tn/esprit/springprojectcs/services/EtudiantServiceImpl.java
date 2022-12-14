package tn.esprit.springprojectcs.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectcs.entities.Contrat;
import tn.esprit.springprojectcs.entities.Departement;
import tn.esprit.springprojectcs.entities.Equipe;
import tn.esprit.springprojectcs.entities.Etudiant;
import tn.esprit.springprojectcs.repository.ConratRepository;
import tn.esprit.springprojectcs.repository.DepartementRepository;
import tn.esprit.springprojectcs.repository.EquipeRepository;
import tn.esprit.springprojectcs.repository.EtudiantRepositoy;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{

   // @Autowired // pour injecter un bean dans un autre bean
    EtudiantRepositoy etudiantRepositoy;
    DepartementRepository departementRepository;

    ConratRepository contratRepository;
    EquipeRepository equipeRepository;

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

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant etudiant = etudiantRepositoy.findById(etudiantId).orElse(null);
        Departement departement = departementRepository.findById(departementId).orElse(null);
        etudiant.setDepartement(departement);
        etudiantRepositoy.save(etudiant);
    }

    @Override
    public Etudiant addAndAssignEtudiantToEquipeAndContract(Etudiant e, Integer idContrat, Integer idEquipe) {
        Contrat contrat = contratRepository.findById(idContrat).orElse(null);
        Equipe equipe = equipeRepository.findById(idEquipe).orElse(null);
        contrat.setEtudiant(e);
        e.getEquipes().add(equipe);
        return etudiantRepositoy.save(e);
    }

    @Override
    public Contrat affectContratToEtudiant(Contrat ce, String nomE, String prenomE) {
       Contrat contrat = contratRepository.findById(ce.getIdContrat()).orElse(null);
       Etudiant etudiant = etudiantRepositoy.findByNomEAndPrenomE(nomE,prenomE);
        contrat.setEtudiant(etudiant);
        return contratRepository.save(contrat);
    }


}
