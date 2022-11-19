package tn.esprit.service.interfaces;

import java.util.List;

import tn.esprit.perssist.Etudiant;

public interface etudiantService {
public Etudiant afficherEtudiant(int id);
public Etudiant ajouterEtudiant(Etudiant e);
public Etudiant mettreAjourEtudiant(int id); 
public void supprimerEtudiant  (int id);
public List<Etudiant>chercheretudiant();}