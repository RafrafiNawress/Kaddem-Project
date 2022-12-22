package tn.esprit.springprojectcs.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.springprojectcs.entities.Departement;
import tn.esprit.springprojectcs.entities.Universite;
import tn.esprit.springprojectcs.repository.DepartementRepository;
import tn.esprit.springprojectcs.repository.UniversiteRepository;

@Service
@AllArgsConstructor
public class UniversiteServiceImpl implements  IUniversite{


    UniversiteRepository universiteRepository;
    DepartementRepository departementRepository;

    @Override
    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);
        Departement departement = departementRepository.findById(idDepartement).orElse(null);
        universite.getDepartements().add(departement);
        universiteRepository.save(universite);

    }
}
