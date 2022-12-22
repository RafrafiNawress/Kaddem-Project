package tn.esprit.springprojectcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.springprojectcs.entities.Etudiant;
import tn.esprit.springprojectcs.entities.Niveau;
import tn.esprit.springprojectcs.entities.Specialite;

import java.util.List;


public interface EtudiantRepositoy extends JpaRepository<Etudiant, Integer> {

    @Query("select e from Etudiant e where e.nomE=?1 and e.prenomE=?2")
   // @Query(value = "select * from Etudiant_Marketing e where e.etudiant_nom=?1 and e.prenomE=?2",nativeQuery = true)
    Etudiant retrieveEtudinatByNomEtPrenom(String nom, String prenom);

    Etudiant findByNomEAndPrenomE(String nom, String prenom);

    List<Etudiant> findByContratsSpecialiteAndEquipesNiveau(Specialite spec, Niveau niveau);
}
