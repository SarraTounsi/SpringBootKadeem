package tn.esprit.perssist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.perssist.Etudiant;
@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Integer>{

}
