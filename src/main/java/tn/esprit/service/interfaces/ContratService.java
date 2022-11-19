package tn.esprit.service.interfaces;

import java.util.List;

import tn.esprit.perssist.Contrat;

public interface ContratService {

    public Contrat afficherContrat(Integer id);
    public Contrat ajouterContrat(Contrat e);
    public Contrat mettreAjourContrat(Contrat e);
    public void supprimerContrat(Integer id);
    public List<Contrat> afficherAllC();
}
