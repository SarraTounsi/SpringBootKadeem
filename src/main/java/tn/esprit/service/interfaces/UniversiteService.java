package tn.esprit.service.interfaces;

import java.util.List;

import tn.esprit.perssist.Universite;

public interface UniversiteService {
 
	public Universite afficherUniversite(Integer id);
    public Universite ajouterUniversite(Universite e);
    public Universite mettreAjourUniversite(Universite e);
    public void supprimerUniversite(Integer id);
    public List<Universite> afficherUniversites();
}
