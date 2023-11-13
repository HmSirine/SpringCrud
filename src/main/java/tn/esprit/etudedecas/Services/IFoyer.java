package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

public interface IFoyer {

    public Foyer AddFoyer(Foyer f);
    public Foyer UpdateFoyer(Foyer f);
    public List<Foyer> GetAllFoyer();
    public Foyer GetFoyerById(long idF);
    public void DeleteFoyer(long idF);

    public Foyer getFoyerByNom(String nomFoyer);

}
