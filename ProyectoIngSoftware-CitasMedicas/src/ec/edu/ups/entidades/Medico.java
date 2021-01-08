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
	
	//OneToMany(cascade )

	public Medico() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idMedico;
		result = prime * result + ((passwordMedico == null) ? 0 : passwordMedico.hashCode());
		result = prime * result + ((urlFotoMedico == null) ? 0 : urlFotoMedico.hashCode());
		result = prime * result + ((userMedico == null) ? 0 : userMedico.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medico other = (Medico) obj;
		if (idMedico != other.idMedico)
			return false;
		if (passwordMedico == null) {
			if (other.passwordMedico != null)
				return false;
		} else if (!passwordMedico.equals(other.passwordMedico))
			return false;
		if (urlFotoMedico == null) {
			if (other.urlFotoMedico != null)
				return false;
		} else if (!urlFotoMedico.equals(other.urlFotoMedico))
			return false;
		if (userMedico == null) {
			if (other.userMedico != null)
				return false;
		} else if (!userMedico.equals(other.userMedico))
			return false;
		return true;
	}   
	

}
