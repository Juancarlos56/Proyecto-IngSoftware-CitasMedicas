package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Secretaria
 *
 */
@Entity

public class Secretaria implements Serializable {

	private static final long serialVersionUID = 1L;  
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "sec_id")
	private int idSecretaria;
	
	@Column(name = "sec_user")
	private String userSecretaria;
	
	@Column(name = "sec_password")
	private String passwordSecretaria;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "responsableLibroDiario")
	private List<LibroDiario> responsableLibroDiario = new ArrayList<LibroDiario>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "secretariaAgendaCita")
	private List<AgendaCitaMedica> secretariaAgendaCita = new ArrayList<AgendaCitaMedica>();
	
	public Secretaria() {
		super();
	}  
	
	
	
	public Secretaria(int idSecretaria, String userSecretaria, String passwordSecretaria,
			List<LibroDiario> responsableLibroDiario, List<AgendaCitaMedica> secretariaAgendaCita) {
		super();
		this.idSecretaria = idSecretaria;
		this.userSecretaria = userSecretaria;
		this.passwordSecretaria = passwordSecretaria;
		this.responsableLibroDiario = responsableLibroDiario;
		this.secretariaAgendaCita = secretariaAgendaCita;
	}



	public int getIdSecretaria() {
		return idSecretaria;
	}



	public void setIdSecretaria(int idSecretaria) {
		this.idSecretaria = idSecretaria;
	}



	public String getUserSecretaria() {
		return userSecretaria;
	}



	public void setUserSecretaria(String userSecretaria) {
		this.userSecretaria = userSecretaria;
	}



	public String getPasswordSecretaria() {
		return passwordSecretaria;
	}



	public void setPasswordSecretaria(String passwordSecretaria) {
		this.passwordSecretaria = passwordSecretaria;
	}



	public List<LibroDiario> getResponsableLibroDiario() {
		return responsableLibroDiario;
	}



	public void setResponsableLibroDiario(List<LibroDiario> responsableLibroDiario) {
		this.responsableLibroDiario = responsableLibroDiario;
	}



	public List<AgendaCitaMedica> getSecretariaAgendaCita() {
		return secretariaAgendaCita;
	}



	public void setSecretariaAgendaCita(List<AgendaCitaMedica> secretariaAgendaCita) {
		this.secretariaAgendaCita = secretariaAgendaCita;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idSecretaria;
		result = prime * result + ((passwordSecretaria == null) ? 0 : passwordSecretaria.hashCode());
		result = prime * result + ((responsableLibroDiario == null) ? 0 : responsableLibroDiario.hashCode());
		result = prime * result + ((secretariaAgendaCita == null) ? 0 : secretariaAgendaCita.hashCode());
		result = prime * result + ((userSecretaria == null) ? 0 : userSecretaria.hashCode());
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
		Secretaria other = (Secretaria) obj;
		if (idSecretaria != other.idSecretaria)
			return false;
		if (passwordSecretaria == null) {
			if (other.passwordSecretaria != null)
				return false;
		} else if (!passwordSecretaria.equals(other.passwordSecretaria))
			return false;
		if (responsableLibroDiario == null) {
			if (other.responsableLibroDiario != null)
				return false;
		} else if (!responsableLibroDiario.equals(other.responsableLibroDiario))
			return false;
		if (secretariaAgendaCita == null) {
			if (other.secretariaAgendaCita != null)
				return false;
		} else if (!secretariaAgendaCita.equals(other.secretariaAgendaCita))
			return false;
		if (userSecretaria == null) {
			if (other.userSecretaria != null)
				return false;
		} else if (!userSecretaria.equals(other.userSecretaria))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Secretaria [idSecretaria=" + idSecretaria + ", userSecretaria=" + userSecretaria
				+ ", passwordSecretaria=" + passwordSecretaria + ", responsableLibroDiario=" + responsableLibroDiario
				+ ", secretariaAgendaCita=" + secretariaAgendaCita + "]";
	}


	

}
