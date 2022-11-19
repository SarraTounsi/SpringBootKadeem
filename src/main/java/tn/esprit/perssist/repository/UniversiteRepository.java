package tn.esprit.perssist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.perssist.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Integer>{

}
