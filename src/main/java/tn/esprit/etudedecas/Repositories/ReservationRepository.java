package tn.esprit.etudedecas.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.etudedecas.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
