package tn.esprit.etudedecas.Services;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.BlocRepository;
import tn.esprit.etudedecas.Repositories.EtudiantRepository;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceIMP implements IBloc {

    @Autowired
    private BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public Bloc updateBloc(Bloc b) {
        return blocRepository.save(b);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc getBlocById(long idB) {
        return blocRepository.findById(idB).orElse(null);
    }

    @Override
    public void deleteBloc(long idB) {
        blocRepository.deleteById(idB);
    }
}

