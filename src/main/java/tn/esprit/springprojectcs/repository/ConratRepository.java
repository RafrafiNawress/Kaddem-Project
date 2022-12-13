package tn.esprit.springprojectcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprojectcs.entities.Contrat;

public interface ConratRepository extends JpaRepository<Contrat,Integer> {

}
