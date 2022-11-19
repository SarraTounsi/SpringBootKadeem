package tn.esprit.service.classes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.perssist.DetailEquipe;
import tn.esprit.perssist.repository.DetailEquipeRepository;
import tn.esprit.service.interfaces.DetailEquipeService;
@Service
public class DetailEquipeServiceImpl implements DetailEquipeService{
	 
	@Autowired
	DetailEquipeRepository detailEquipRepo;
	
	@Override
    public DetailEquipe afficherDetailEquipe(Integer id) {
    	
        return this.detailEquipRepo.findById(id).get();
    }

    @Override
    public DetailEquipe ajouterDetailEquipe(DetailEquipe e) {
        return this.detailEquipRepo.save(e);
    }

    @Override
    public DetailEquipe mettreAjourDetailEquipe(DetailEquipe e) {
        DetailEquipe DetailEquipe = detailEquipRepo.findById(e.getIdDetailEquipe()).orElse(null);
        if (DetailEquipe != null)
            detailEquipRepo.save(e);
        return e;
    }

    @Override
    public void supprimerDetailEquipe(Integer id) {
        detailEquipRepo.deleteById(id);
    }

    @Override
    public List<DetailEquipe> afficherDetailEquipes() {
        return detailEquipRepo.findAll();

}}
