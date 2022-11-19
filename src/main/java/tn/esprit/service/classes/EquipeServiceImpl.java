package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.perssist.Equipe;
import tn.esprit.perssist.repository.EquipeRepository;
import tn.esprit.service.interfaces.EquipeService;
@Slf4j
@Service
public class EquipeServiceImpl implements EquipeService {
	@Autowired
	EquipeRepository equipeRep;

	@Override
	public List<Equipe> afficherEquipes() {
	return equipeRep.findAll();}
		
	
	
	@Override
	public Equipe afficherEquipe(Integer id) {
		return this.equipeRep.findById(id).get();
	}

	@Override
	public Equipe ajouterEquipe(Equipe e) {
		return this.equipeRep.save(e);
	}

	@Override
	
	public Equipe mettreAjourEquipe(Equipe e) {
		Equipe equipe = equipeRep.findById(e.getIdEquipe()).orElse(null);
		if (equipe != null)
			equipeRep.save(e);
		return e;
	}

	@Override
	public void supprimerEquipe(Integer id) {
		equipeRep.deleteById(id);
	}

}
