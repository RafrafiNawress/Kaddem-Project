package tn.esprit.springprojectcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.springprojectcs.entities.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Integer> {
}
