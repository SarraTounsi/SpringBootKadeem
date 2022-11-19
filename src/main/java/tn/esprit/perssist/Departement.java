package tn.esprit.perssist;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table( name = "Departement")
public class Departement {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDep")
	private Integer idDep;
	private String nomDep;
	@OneToMany(cascade = CascadeType.ALL,mappedBy="departement")
	private Set<Etudiant> etudiants;
	public Integer getIdDep() {
		return idDep;
	}
	public void setIdDep(Integer idDep) {
		this.idDep = idDep;
	}
	public String getNomDep() {
		return nomDep;
	}
	public void setNomDep(String nomDep) {
		this.nomDep = nomDep;
	}
	public Departement(Integer idDep, String nomDep) {
		super();
		this.idDep = idDep;
		this.nomDep = nomDep;
	}
	public Departement() {
		super();
	}

}
