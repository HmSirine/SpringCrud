package tn.esprit.etudedecas.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.etudedecas.Repositories.ReservationRepository;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

@Service
public class ReservationServiceIMP implements IReservation {


    @Autowired
    public ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findById(long idReservation) {
        return reservationRepository.findById(idReservation).orElse(null);
    }

    @Override
    public void deleteReservation(long idReservation) {
        reservationRepository.deleteById(idReservation);

    }
}
