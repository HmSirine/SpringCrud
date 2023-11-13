package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IEtudiant;
import tn.esprit.etudedecas.entities.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
public class EtudiantRestController {

    @Autowired
    private IEtudiant iEtudiant;
    @PostMapping("/addEtudiant")
    public Etudiant addEtudiant(@RequestBody Etudiant e){
        return iEtudiant.addEtudiant(e);
    }
    @PutMapping("/updateEtudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e){
        return iEtudiant.updateEtudiant(e);
    }
    @GetMapping("/getAllEtudiant")
    public List<Etudiant> getAll(){
        return iEtudiant.getAllEtudiant();
    }
    @GetMapping("/getByIdEtudiant/{idEtudiant}")
    public Etudiant getById(@PathVariable long idEtudiant){
        return iEtudiant.findById(idEtudiant);
    }
    @DeleteMapping("/deleteByIdEtudiant/{idEtudiant}")
    public void deleteById(@PathVariable long idEtudiant){
        iEtudiant.deleteEtudiant(idEtudiant);

    }

}
