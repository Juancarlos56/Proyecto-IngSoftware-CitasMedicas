package ec.edu.ups.entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medico
 *
 */
@Entity

public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "med_id")
	private int idMedico;
	
	@Column(name = "med_user")
	private String userMedico;
	
	@Column(name = "med_password")
	private String passwordMedico;
	
	@Column(name = "med_foto")
	private String urlFotoMedico;
	
	OneToMany(cascade )

	public Medico() {
		super();
	}   

}
