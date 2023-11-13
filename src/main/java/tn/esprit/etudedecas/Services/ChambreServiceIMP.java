package tn.esprit.etudedecas.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.ChambreRepository;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

@Service
public class ChambreServiceIMP implements IChambre{


    @Autowired
    public ChambreRepository chambreRepository;

    @Override
    public Chambre addChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public Chambre updateChambre(Chambre chambre) {
        return chambreRepository.save(chambre);
    }

    @Override
    public List<Chambre> getAllChambre() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre findById(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public void deleteChambre(long idChambre) {
        chambreRepository.deleteById(idChambre);
    }
}
