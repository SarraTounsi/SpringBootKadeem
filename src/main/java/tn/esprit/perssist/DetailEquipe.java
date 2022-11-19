package tn.esprit.perssist;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailequipe")
	private Integer idDetailEquipe;
	
	@OneToOne(mappedBy = "detailEquipe")
	private Equipe equipe;
	public DetailEquipe() {
		super();
	}
	public DetailEquipe(Integer idDetailEquipe, Integer salle, String thematique) {
		super();
		this.idDetailEquipe = idDetailEquipe;
		Salle = salle;
		this.thematique = thematique;
	}
	public Integer getIdDetailEquipe() {
		return idDetailEquipe;
	}
	public void setIdDetailEquipe(Integer idDetailEquipe) {
		this.idDetailEquipe = idDetailEquipe;
	}
	public Integer getSalle() {
		return Salle;
	}
	public void setSalle(Integer salle) {
		Salle = salle;
	}
	public String getThematique() {
		return thematique;
	}
	public void setThematique(String thematique) {
		this.thematique = thematique;
	}
	private Integer Salle;
	private String thematique;
	

}
