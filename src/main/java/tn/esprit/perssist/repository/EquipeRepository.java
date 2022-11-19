package tn.esprit.perssist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.perssist.Equipe;
@Repository
public interface EquipeRepository extends JpaRepository<Equipe,Integer> {

}
