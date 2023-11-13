package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

public interface IChambre {

    public Chambre addChambre(Chambre chambre);
    public Chambre updateChambre(Chambre chambre);
    public List<Chambre> getAllChambre();
    public Chambre findById(long idChambre);
    public void deleteChambre(long idChambre);

}
