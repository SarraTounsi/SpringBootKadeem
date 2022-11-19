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

import tn.esprit.perssist.DetailEquipe;
import tn.esprit.service.interfaces.DepartementService;
import tn.esprit.service.interfaces.DetailEquipeService;

@RestController
@RequestMapping("/detailEquipeController")
public class DetailEquipeController {

	 @Autowired
	 DetailEquipeService DetEServ;
	 @GetMapping("/DisplayDetailEquipe")
	    public List<DetailEquipe> DisplayDetailEquipe() {
	        
	        return DetEServ.afficherDetailEquipes();
	    }

	    @GetMapping("/DisplayDetailEquipeById/{id}")
	    public DetailEquipe displayDetailEquipeByID(@PathVariable("id") int id) {

	        return DetEServ.afficherDetailEquipe(id);
	    }

	    @PostMapping("/AddDetailEquipe")
	    public DetailEquipe addDetailEquipe(@RequestBody DetailEquipe e) {
	        
	        return DetEServ.ajouterDetailEquipe(e);
	    }

	    @PutMapping("/UpdateDetailEquipe")
	    public DetailEquipe updateDetailEquipe(@RequestBody DetailEquipe e) {
	        return DetEServ.mettreAjourDetailEquipe(e);
	    }

	    @DeleteMapping("/deleteDetailEquipe/{idDetailEquipe}")
	    public void deleteDetailEquipe(@PathVariable("idDetailEquipe") int id) {
	        DetEServ.supprimerDetailEquipe(id);
	    }
}
