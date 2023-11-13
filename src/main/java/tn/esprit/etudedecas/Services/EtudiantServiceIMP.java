package tn.esprit.etudedecas.Services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.EtudiantRepository;
import tn.esprit.etudedecas.entities.Etudiant;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceIMP implements IEtudiant{

    @Autowired
    private EtudiantRepository etudiantRepository;

    @Override
    public Etudiant addEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findById(long idEtudiant) {
        return etudiantRepository.findById(idEtudiant).orElse(null);
    }

    @Override
    public void deleteEtudiant(long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }
}
