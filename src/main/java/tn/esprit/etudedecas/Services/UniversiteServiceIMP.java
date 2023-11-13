package tn.esprit.etudedecas.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.UniversiteRepository;
import tn.esprit.etudedecas.entities.Universite;

import java.util.List;

@Service
public class UniversiteServiceIMP implements IUniversite {

    @Autowired
    public UniversiteRepository universiteRepository;

    @Override
    public Universite addUniversite(Universite universite) {
        return  universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return  universiteRepository.save(universite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return  universiteRepository.findAll();
    }

    @Override
    public Universite findById(long idUniversite) {
        return  universiteRepository.findById(idUniversite).orElse(null);
    }

    @Override
    public void deleteById(long idUniversite) {
        universiteRepository.deleteById(idUniversite);
    }
}
