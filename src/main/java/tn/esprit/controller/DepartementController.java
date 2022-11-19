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

import tn.esprit.perssist.Departement;
import tn.esprit.service.interfaces.DepartementService;
@RestController
@RequestMapping("/DepartementController")
public class DepartementController {
	
	@Autowired
	DepartementService depserv;
	
	 @GetMapping("/DisplayDepartements")
	    public List<Departement> DisplayDepartement() {
	        return depserv.afficherDepartements();
	    }

	    @GetMapping("/DisplayDepartementById/{id}")
	    public Departement displayDepartementByID(@PathVariable("id") int id) {

	        return depserv.afficherDepartement(id);
	    }

	    @PostMapping("/AddDepartement")
	    public Departement addDepartement(@RequestBody Departement e) {
	        return depserv.ajouterDepartement(e);
	    }

	    @PutMapping("/UpdateDepartement")
	    public Departement updateDepartement(@RequestBody Departement e) {
	        return depserv.mettreAjourDepartement(e);
	    }

	    @DeleteMapping("/deleteDepartement/{idDepartement}")
	    public void deleteDepartement(@PathVariable("idDepartement") int id) {
	        depserv.supprimerDepartement(id);
	    }


}
