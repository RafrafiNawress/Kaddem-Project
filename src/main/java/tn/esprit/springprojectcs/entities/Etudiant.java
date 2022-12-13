package tn.esprit.springprojectcs.entities;

import lombok.*;
import net.bytebuddy.utility.nullability.MaybeNull;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Etudiant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEtudiant;
    String nomE;
    String prenomE;
    @Enumerated(EnumType.STRING)
    Option op;

    @OneToMany(mappedBy = "etudiant")
    Set<Contrat> contrats;

    @ManyToMany
    Set<Equipe> equipes;

    @ManyToOne
    Departement departement;
}
