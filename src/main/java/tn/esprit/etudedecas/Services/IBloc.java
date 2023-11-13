package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

public interface IBloc {

    public Bloc addBloc(Bloc b);
    public Bloc updateBloc(Bloc b);
    public List<Bloc> getAllBloc();

    public Bloc getBlocById(long idB);
    public void deleteBloc(long idB);
}
