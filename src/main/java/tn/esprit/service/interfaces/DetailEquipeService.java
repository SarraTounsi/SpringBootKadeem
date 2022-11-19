package tn.esprit.service.interfaces;

import java.util.List;

import tn.esprit.perssist.DetailEquipe;

public interface DetailEquipeService {

	 public DetailEquipe afficherDetailEquipe(Integer id);
	 public DetailEquipe ajouterDetailEquipe(DetailEquipe e);
	 public DetailEquipe mettreAjourDetailEquipe(DetailEquipe e);
	 public void supprimerDetailEquipe(Integer id);
	 public List<DetailEquipe> afficherDetailEquipes();
}
