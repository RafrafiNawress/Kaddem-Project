package tn.esprit.springprojectcs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.springprojectcs.entities.Contrat;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;

public interface ConratRepository extends JpaRepository<Contrat,Integer> {

    List<Contrat> findByDateFinContratBetween(Date startDate, Date endDate);

}
