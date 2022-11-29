package tn.esprit.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import tn.esprit.perssist.Equipe;
import tn.esprit.service.interfaces.EquipeService;

@RestController
@RequestMapping("/equipeController")
public class EquipeController {
	@Autowired
	EquipeService equipeServ;
	
    @Scheduled(fixedRate = 6000)
	@GetMapping("/DisplayAll")
	public List<Equipe> DisplayAll() {
		return equipeServ.afficherEquipes();
	}

	@GetMapping("/DisplayEquipeById/{id}")
	public Equipe displayEquipeByID(@PathVariable("id") int id) {

		return equipeServ.afficherEquipe(id);
	}
	
	@PostMapping("/AddEquipe")
	public Equipe addEquipe(@RequestBody Equipe e) {
		return equipeServ.ajouterEquipe(e);
	}

	@PutMapping("/UpdateEquipe")
	public Equipe updateEquipe(@RequestBody Equipe e) {
		return equipeServ.mettreAjourEquipe(e);
	}

	@DeleteMapping("/deleteEquipe/{idEquipe}")
	public void deleteEquipe(@PathVariable("idEquipe") int id) {
		equipeServ.supprimerEquipe(id);
	}
}
