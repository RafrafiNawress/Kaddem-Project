package tn.esprit.springprojectcs.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Builder
public class Equipe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    @NonNull
    private String nomEquipe;
    @Enumerated(EnumType.STRING)
    @NonNull
    private Niveau niveau;

    @ManyToMany(mappedBy = "equipes")
    Set<Etudiant> etudiants;
    @OneToOne(cascade = CascadeType.ALL)
    DetailEquipe detailEquipe;


}
