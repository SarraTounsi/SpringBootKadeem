package tn.esprit.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.perssist.Etudiant;
import tn.esprit.service.interfaces.etudiantService;

@RestController
@RequestMapping("/etudiantController")
public class EtudiantController {
	@Autowired
	etudiantService etudserv;
	@GetMapping("/displayAll")
	public List<Etudiant> displayAllStudent()
	{
		return etudserv.chercheretudiant();
	}
	
	@GetMapping("/afficherEtudiant/{idEtudiant}")
	public Etudiant afficherEtudiant(@PathVariable("idEtudiant") int idEtudiant) {
	return etudserv.afficherEtudiant(idEtudiant);
	}

	@DeleteMapping("/deleteEtudiant/{idEtudiant}")
	public void deleteEtudiant(@PathVariable("idEtudiant") int idEtudiant) {
	         etudserv.supprimerEtudiant(idEtudiant);
	} 
	@PostMapping("/AddEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e) {
        return etudserv.ajouterEtudiant(e);
    }

}
