package tn.esprit.perssist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.perssist.Departement;
@Repository
public interface DepartementRepository extends JpaRepository<Departement,Integer>{

}
