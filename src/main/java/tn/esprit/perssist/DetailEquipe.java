package tn.esprit.perssist;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table( name = "DetailEquipe")
public class DetailEquipe {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name="idDetailequipe")
	private Integer idDetailEquipe;
	

	private Integer Salle;
	private String thematique;
	@OneToOne(mappedBy = "detailEquipe")
	private Equipe equipe;	

}
