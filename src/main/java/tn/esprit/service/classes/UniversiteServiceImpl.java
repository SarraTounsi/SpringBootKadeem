package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.perssist.Universite;
import tn.esprit.perssist.repository.UniversiteRepository;
import tn.esprit.service.interfaces.UniversiteService;
@Slf4j
@Service
public class UniversiteServiceImpl implements UniversiteService{
	
	@Autowired
	UniversiteRepository univRepo;
	
	  

	    @Override
	    public Universite ajouterUniversite(Universite e) {
	        return this.univRepo.save(e);
	     }
	    @Override
	    public Universite mettreAjourUniversite(Universite e) {
	    	  log.info(""+e);
	    	     
	    	     return  univRepo.save(e);
	    }

	    @Override
	    public void supprimerUniversite(Integer id) {
	    	
	        univRepo.deleteById(id);
	       
	    }

	    @Override
	    public Universite afficherUniversite(Integer id) {
	    	 log.trace("here we will display 1 university <3");

	        return this.univRepo.findById(id).get();
	    }
	   


	    @Override
	    public List<Universite> afficherUniversites() {

	        List<Universite> universites=univRepo.findAll();
	      
	        return universites;}
	   

}
