package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Chambre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idChambre;
    private long numChambre;
    @Enumerated(EnumType.STRING)
    private TypeChambre typeChambre;

    //On a fait un table d'association
    @OneToMany
    private Set<Reservation>reservations;
}
