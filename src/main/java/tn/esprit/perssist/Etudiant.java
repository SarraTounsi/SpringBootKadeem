package tn.esprit.perssist;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString 
@Table( name = "Etudiant")
public class Etudiant implements Serializable {

@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column(name="idEtudiant")
private Integer idEtudiant;

private String nomE;

private String prenomE;

@Enumerated(EnumType.STRING)
private option op;


@OneToMany(cascade = CascadeType.ALL,mappedBy="etudiant")
private Set<Contrat> contrats;

@ManyToMany(cascade = CascadeType.ALL,mappedBy="etudiants")
private Set<Equipe> equipes;

@ManyToOne
Departement departement;



}
