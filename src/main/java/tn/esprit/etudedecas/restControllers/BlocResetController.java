package tn.esprit.etudedecas.restControllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.etudedecas.Services.IBloc;
import tn.esprit.etudedecas.Services.IEtudiant;
import tn.esprit.etudedecas.entities.Bloc;
import tn.esprit.etudedecas.entities.Etudiant;

import java.util.List;

@RestController
@AllArgsConstructor
public class BlocResetController {


    private IBloc iBloc;
    @PostMapping("/addBloc")
    public Bloc addBloc(@RequestBody Bloc b){
        return iBloc.addBloc(b);
    }
    @PutMapping("/updateBloc")
    public Bloc updateBloc(@RequestBody Bloc b){
        return iBloc.updateBloc(b);
    }
    @GetMapping("/getAllBloc"git commit -m "first commit")
    public List<Bloc> getAll(){
        return iBloc.getAllBloc();
    }
    @DeleteMapping("/deleteByIdBloc/{idEtudiant}")
    public void deleteBloc(@PathVariable long idBloc) {
        iBloc.deleteBloc(idBloc);
    }

}
