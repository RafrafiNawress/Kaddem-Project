package tn.esprit.springprojectcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectcs.entities.Etudiant;


public interface EtudiantRepositoy extends JpaRepository<Etudiant, Integer> {
}
