package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Consulta
 *
 */
@Entity

public class Consulta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int idConsulta;
	private Paciente paciente;
	private Medico medico;
	private Date fechaactual;
	private String sintomas;
	private String observaciones;
	private String medicinas;
	private String dosis;
	private Certificado certificado;
	private ArrayList<Orden> oredenes;
	
	
	

	public Consulta() {
		super();
	}




	public int getIdConsulta() {
		return idConsulta;
	}




	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}




	public Paciente getPaciente() {
		return paciente;
	}




	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}




	public Medico getMedico() {
		return medico;
	}




	public void setMedico(Medico medico) {
		this.medico = medico;
	}




	public Date getFechaactual() {
		return fechaactual;
	}




	public void setFechaactual(Date fechaactual) {
		this.fechaactual = fechaactual;
	}




	public String getSintomas() {
		return sintomas;
	}




	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}




	public String getObservaciones() {
		return observaciones;
	}




	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}




	public String getMedicinas() {
		return medicinas;
	}




	public void setMedicinas(String medicinas) {
		this.medicinas = medicinas;
	}




	public String getDosis() {
		return dosis;
	}




	public void setDosis(String dosis) {
		this.dosis = dosis;
	}




	public Certificado getCertificado() {
		return certificado;
	}




	public void setCertificado(Certificado certificado) {
		this.certificado = certificado;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dosis == null) ? 0 : dosis.hashCode());
		result = prime * result + ((fechaactual == null) ? 0 : fechaactual.hashCode());
		result = prime * result + idConsulta;
		result = prime * result + ((medicinas == null) ? 0 : medicinas.hashCode());
		result = prime * result + ((observaciones == null) ? 0 : observaciones.hashCode());
		result = prime * result + ((paciente == null) ? 0 : paciente.hashCode());
		result = prime * result + ((sintomas == null) ? 0 : sintomas.hashCode());
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
		Consulta other = (Consulta) obj;
		if (dosis == null) {
			if (other.dosis != null)
				return false;
		} else if (!dosis.equals(other.dosis))
			return false;
		if (fechaactual == null) {
			if (other.fechaactual != null)
				return false;
		} else if (!fechaactual.equals(other.fechaactual))
			return false;
		if (idConsulta != other.idConsulta)
			return false;
		if (medicinas == null) {
			if (other.medicinas != null)
				return false;
		} else if (!medicinas.equals(other.medicinas))
			return false;
		if (observaciones == null) {
			if (other.observaciones != null)
				return false;
		} else if (!observaciones.equals(other.observaciones))
			return false;
		if (paciente == null) {
			if (other.paciente != null)
				return false;
		} else if (!paciente.equals(other.paciente))
			return false;
		if (sintomas == null) {
			if (other.sintomas != null)
				return false;
		} else if (!sintomas.equals(other.sintomas))
			return false;
		return true;
	}




	public ArrayList<Orden> getOredenes() {
		return oredenes;
	}




	public void setOredenes(ArrayList<Orden> oredenes) {
		this.oredenes = oredenes;
	}
   
}
