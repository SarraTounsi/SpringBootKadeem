package tn.esprit.perssist.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.esprit.perssist.Universite;
@Repository
public interface UniversiteRepository extends JpaRepository<Universite,Integer>{
	@Modifying
	@Query("DELETE FROM Universite u WHERE u.nomUniv= :nomUniv")
	int deleteUniversiteByNomUniv(@Param("nomUniv")String nomUniv);
}
