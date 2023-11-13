package tn.esprit.etudedecas.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IReservation;
import tn.esprit.etudedecas.entities.Chambre;
import tn.esprit.etudedecas.entities.Reservation;

import java.util.List;

@RestController
public class ReservationResetController {

    @Autowired
    public IReservation iReservation;


    @PostMapping("/addReser")
    public Reservation addReservation(@RequestBody Reservation reservation){
        return iReservation.addReservation(reservation);
    }

    @PutMapping("/updateReser")
    public Reservation updateReservation(@RequestBody Reservation reservation){
        return iReservation.updateReservation(reservation);
    }
    @GetMapping("/getAllReser")
    public List<Reservation> getAll(){
        return iReservation.getAllReservation();
    }
    @GetMapping("/getByIdReser")
    public Reservation GetById(@PathVariable long idReservation){
        return iReservation.findById(idReservation);
    }

    @DeleteMapping("/deleteReser")
    public void deleteById(@PathVariable long idReservation){
        iReservation.deleteReservation(idReservation);
    }

}
