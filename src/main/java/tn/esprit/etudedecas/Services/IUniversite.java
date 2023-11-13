package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Universite;

import java.util.List;

public interface IUniversite {

    public Universite addUniversite(Universite universite);
    public Universite updateUniversite(Universite universite);
    public List<Universite> getAllUniversite();
    public Universite findById(long idUniversite);
    public void deleteById(long idUniversite);
}
