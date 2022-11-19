package tn.esprit.service.classes;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.perssist.Etudiant;
import tn.esprit.perssist.repository.EtudiantRepository;
import tn.esprit.service.interfaces.etudiantService;
@Service
public class EtudiantServiceImpl implements etudiantService {

	@Autowired
	EtudiantRepository etudRep;
	@Override
	public Etudiant afficherEtudiant(int id) {
	 
		Etudiant e =etudRep.findById(id).get();
		return e;
		
	}

	@Override
	public Etudiant ajouterEtudiant(Etudiant e) {
		etudRep.save(e);
		return e;
		
	}

	@Override
	public Etudiant mettreAjourEtudiant(int id) {
		Etudiant e = etudRep.findById(id).get();
		etudRep.save(e);
		return (e);
	}

	@Override
	public void supprimerEtudiant(int id) {
		etudRep.deleteById(id);
		
	}

	@Override
	public List<Etudiant> chercheretudiant() {
		return etudRep.findAll();
		
		
	}

}
