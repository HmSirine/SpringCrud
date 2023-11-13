package tn.esprit.etudedecas.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString

public class Etudiant implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long idEtud;
    private String nomEtud;
    private String prenomEtud;
    private long cin;
    private String ecole;
    @Temporal(TemporalType.DATE)
    private Date dataNaissance;

    @ManyToMany(mappedBy = "etudiants")
    private Set<Reservation> reservations;
}
