package tn.esprit.etudedecas.Services;

import tn.esprit.etudedecas.entities.Etudiant;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

public interface IReservation {

    public Reservation addReservation(Reservation reservation);
    public Reservation updateReservation(Reservation reservation);
    public List<Reservation> getAllReservation();
    public Reservation findById(long idReservation);
    public void deleteReservation(long idReservation);

}
