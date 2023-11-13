package tn.esprit.etudedecas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Bloc;

public interface BlocRepository extends JpaRepository<Bloc, Long> {
}
