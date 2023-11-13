package tn.esprit.etudedecas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Foyer;

public interface FoyerRepository extends JpaRepository<Foyer,Long> {

    public Foyer findByNomFoyer(String nomFoyer);




}
