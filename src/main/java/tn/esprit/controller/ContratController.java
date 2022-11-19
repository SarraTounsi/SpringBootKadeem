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

import tn.esprit.perssist.Contrat;
import tn.esprit.service.interfaces.ContratService;

@RestController
@RequestMapping("/contratController")
public class ContratController {

	
	@Autowired
	ContratService contratserv;
	
	 @GetMapping("/DisplayAll")
	    public List<Contrat> DisplayAll() {
	        return contratserv.afficherAllC();
	    }

	    @GetMapping("/DisplayContratById/{id}")
	    public Contrat displayContratByID(@PathVariable("id") int id) {

	        return contratserv.afficherContrat(id);
	    }

	    @PostMapping("/AddContrat")
	    public Contrat addContrat(@RequestBody Contrat e) {
	        return contratserv.ajouterContrat(e);
	    }

	    @PutMapping("/UpdateContrat")
	    public Contrat updateContrat(@RequestBody Contrat e) {
	        return contratserv.mettreAjourContrat(e);
	    }

	    @DeleteMapping("/deleteContrat/{idContrat}")
	    public void deleteContrat(@PathVariable("idContrat") int id) {
	        contratserv.supprimerContrat(id);
	    }
	
}
