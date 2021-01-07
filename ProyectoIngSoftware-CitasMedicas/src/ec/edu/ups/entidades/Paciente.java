package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int idPaciente;
	private String tipoSangre;
	private ArrayList<HistorialMedico> historialMedico;

	public Paciente() {
		super();
	}

	public int getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getTipoSangre() {
		return tipoSangre;
	}

	public void setTipoSangre(String tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	public ArrayList<HistorialMedico> getHistorialMedico() {
		return historialMedico;
	}

	public void setHistorialMedico(ArrayList<HistorialMedico> historialMedico) {
		this.historialMedico = historialMedico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idPaciente;
		result = prime * result + ((tipoSangre == null) ? 0 : tipoSangre.hashCode());
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
		Paciente other = (Paciente) obj;
		if (idPaciente != other.idPaciente)
			return false;
		if (tipoSangre == null) {
			if (other.tipoSangre != null)
				return false;
		} else if (!tipoSangre.equals(other.tipoSangre))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Paciente [idPaciente=" + idPaciente + ", tipoSangre=" + tipoSangre + "]";
	}
	
   
}
