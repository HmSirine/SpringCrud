package tn.esprit.etudedecas.restControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IChambre;
import tn.esprit.etudedecas.entities.Chambre;

import java.util.List;

@RestController
public class ChambreResetController {

    @Autowired
    public IChambre iChambre;

    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre chambre){
        return iChambre.addChambre(chambre);
    }

    @PutMapping("/updateChambre")
    public Chambre updateChambre(@RequestBody Chambre chambre){
        return iChambre.updateChambre(chambre);
    }
    @GetMapping("/getAllChambre")
    public List<Chambre> getAllChambre(){
        return iChambre.getAllChambre();
    }

    @GetMapping("/getById/{idChambre}")
    public Chambre getById(@PathVariable long idChambre){
        return iChambre.findById(idChambre);
    }

    @DeleteMapping("/deleteChambre/{idChambre}")
    public void deleteById(@PathVariable long idChambre){
        iChambre.deleteChambre(idChambre);
    }
}
