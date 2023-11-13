package tn.esprit.etudedecas.restControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.GetExchange;
import tn.esprit.etudedecas.Services.IFoyer;
import tn.esprit.etudedecas.entities.Foyer;

import java.util.List;

@RestController
public class FoyerRestController {
    @Autowired
    private IFoyer iFoyer;

    @PostMapping("/addFoyer")
    public Foyer AddFoyer(@RequestBody Foyer f) {
        return iFoyer.AddFoyer(f);

    }
    @PutMapping("/updateFoyer")
    public Foyer UpdateFoyer(@RequestBody Foyer f){
        return iFoyer.UpdateFoyer(f);
    }
    @GetMapping("/getAll")
    public List<Foyer> GetAll(){
        return iFoyer.GetAllFoyer();
    }
    @GetMapping("/getById/{id}")
    public Foyer GetById(@PathVariable long id){
        return iFoyer.GetFoyerById(id);
    }

    @DeleteMapping("/deleteFoyer/{id}")
    public void DeleteById(@PathVariable long id){
        iFoyer.DeleteFoyer(id);
    }



}