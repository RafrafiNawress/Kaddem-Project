package tn.esprit.springprojectcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectcs.entities.Departement;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {
}
