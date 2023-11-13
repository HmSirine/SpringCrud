package tn.esprit.etudedecas.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.FoyerRepository;
import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

@Service
public class FoyerServiceIMP implements IFoyer{

    @Autowired
    private FoyerRepository foyerRepository;
    @Override
    public Foyer AddFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public Foyer UpdateFoyer(Foyer f) {
        return foyerRepository.save(f);
    }

    @Override
    public List<Foyer> GetAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer GetFoyerById(long idF) {
        return foyerRepository.findById(idF).orElse(null);
    }

    @Override
    public void DeleteFoyer(long idF) {
        foyerRepository.deleteById(idF);
    }

    @Override
    public Foyer getFoyerByNom(String nomFoyer) {
        return foyerRepository.findByNomFoyer( nomFoyer) ;
    }
}
