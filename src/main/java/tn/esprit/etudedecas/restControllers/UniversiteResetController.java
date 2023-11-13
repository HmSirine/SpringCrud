package tn.esprit.etudedecas.restControllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IUniversite;
import tn.esprit.etudedecas.entities.Universite;

import java.util.List;

@RestController
public class UniversiteResetController {

    @Autowired
    public IUniversite iUniversite;

    @PostMapping("/addUni")
    public Universite addUniversite(@RequestBody Universite universite){
        return iUniversite.addUniversite(universite);
    }
    @PutMapping("/updateUni")
    public Universite updateUniversite(@RequestBody Universite universite){
        return iUniversite.updateUniversite(universite);
    }
    @GetMapping("/getAllUni")
    public List<Universite> getAll(){
        return iUniversite.getAllUniversite();
    }

    @GetMapping("/findByIdUni/{id}")
    public Universite getById(@PathVariable long idUniversite){
        return iUniversite.findById(idUniversite);
    }

    @DeleteMapping("/deleteUni/{id}")
    public void deleteUniversite(@PathVariable long idUniversite){
        iUniversite.deleteById(idUniversite);
    }
}

