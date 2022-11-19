package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.perssist.Contrat;
import tn.esprit.perssist.repository.ContratRepository;
import tn.esprit.service.interfaces.ContratService;
@Service
public class ContratServiceImpl implements ContratService {
	
	@Autowired 
     ContratRepository contratRep;
	
	@Override
    public Contrat afficherContrat(Integer id) {
              return contratRep.findById(id).get();}

    @Override
    public Contrat ajouterContrat(Contrat e) {
        return this.contratRep.save(e);

    }

    @Override
    public Contrat mettreAjourContrat(Contrat e) {
        Contrat Contrat = contratRep.findById(e.getIdContrat()).orElse(null);
        if(Contrat != null)
            contratRep.save(e);
        return e;

    }

    @Override
    public void supprimerContrat(Integer id) {
        contratRep.deleteById(id);
    }

    @Override
    public List<Contrat> afficherAllC() {
        return contratRep.findAll();

	

}}
