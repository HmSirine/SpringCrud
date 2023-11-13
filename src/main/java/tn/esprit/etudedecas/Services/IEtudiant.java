package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Etudiant;

import java.util.List;

public interface IEtudiant {

    public Etudiant addEtudiant(Etudiant etudiant);
    public Etudiant updateEtudiant(Etudiant etudiant);
    public List<Etudiant> getAllEtudiant();
    public Etudiant findById(long idEtudiant);
    public void deleteEtudiant(long idEtudiant);

}
