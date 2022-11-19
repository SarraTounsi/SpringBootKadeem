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

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@EqualsAndHashCode
@ToString
@Entity
@Table( name = "université")
public class Universite {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idUniv")
private Integer idUniv;
private String nomUniv;
@OneToMany(cascade = CascadeType.ALL)
private Set<Departement> departements;


public Integer getIdUniv() {
	return idUniv;
}
public void setIdUniv(Integer idUniv) {
	this.idUniv = idUniv;
}
public String getNomUniv() {
	return nomUniv;
}
public void setNomUniv(String nomUniv) {
	this.nomUniv = nomUniv;
}
public Universite(Integer idUniv, String nomUniv) {
	super();
	this.idUniv = idUniv;
	this.nomUniv = nomUniv;
}
public Universite() {
	super();
}

}
