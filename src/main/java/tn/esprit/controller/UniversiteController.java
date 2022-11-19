package tn.esprit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.perssist.Universite;
import tn.esprit.service.interfaces.UniversiteService;
@RestController
@RequestMapping("/universiteController")
public class UniversiteController {

	@Autowired 
	UniversiteService univServ;
	
	 @GetMapping("/DisplayUniversite")
	    public List<Universite> DisplayUniversite() {
	        return univServ.afficherUniversites();
	    }

	    @GetMapping("/DisplayUniversiteById/{id}")
	    public Universite displayUniversiteByID(@PathVariable("id") int id) {

	        return univServ.afficherUniversite(id);
	    }

	    @PostMapping("/AddUniversite")
	    public Universite addUniversite(@RequestBody Universite e) {
	        return univServ.ajouterUniversite(e);
	    }

	    @PutMapping("/UpdateUniversite")
	    public Universite updateUniversite(@RequestBody Universite e) {
	        return univServ.mettreAjourUniversite(e);
	    }

	    @DeleteMapping("/deleteUniversite/{idUniversite}")
	    public void deleteUniversite(@PathVariable("idUniversite") int id) {
	        univServ.supprimerUniversite(id);
	    }
}
