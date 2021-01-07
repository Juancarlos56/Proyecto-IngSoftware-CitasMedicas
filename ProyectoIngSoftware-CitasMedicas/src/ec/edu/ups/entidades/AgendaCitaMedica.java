package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: AgendaCitaMedica
 *
 */
@Entity

public class AgendaCitaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAgenda;
	
	private Paciente paciente;
	private Medico medico;
	private GregorianCalendar fechaActual;
	private GregorianCalendar fechaReserva;
	private String tipoCita;
	private String estado;
	private float precio;
	@Column
	private Secretaria secretariaAgendaCita;
	
	
	public AgendaCitaMedica() {
		super();
	}
	public int getIdAgenda() {
		return idAgenda;
	}
	public void setIdAgenda(int idAgenda) {
		this.idAgenda = idAgenda;
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
	public GregorianCalendar getFechaActual() {
		return fechaActual;
	}
	public void setFechaActual(GregorianCalendar fechaActual) {
		this.fechaActual = fechaActual;
	}
	public GregorianCalendar getFechaReserva() {
		return fechaReserva;
	}
	public void setFechaReserva(GregorianCalendar fechaReserva) {
		this.fechaReserva = fechaReserva;
	}
	public String getTipoCita() {
		return tipoCita;
	}
	public void setTipoCita(String tipoCita) {
		this.tipoCita = tipoCita;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public Secretaria getSecretaria() {
		return secretariaAgendaCita;
	}
	public void setSecretaria(Secretaria secretaria) {
		this.secretariaAgendaCita = secretaria;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaActual == null) ? 0 : fechaActual.hashCode());
		result = prime * result + ((fechaReserva == null) ? 0 : fechaReserva.hashCode());
		result = prime * result + idAgenda;
		result = prime * result + Float.floatToIntBits(precio);
		result = prime * result + ((tipoCita == null) ? 0 : tipoCita.hashCode());
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
		AgendaCitaMedica other = (AgendaCitaMedica) obj;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fechaActual == null) {
			if (other.fechaActual != null)
				return false;
		} else if (!fechaActual.equals(other.fechaActual))
			return false;
		if (fechaReserva == null) {
			if (other.fechaReserva != null)
				return false;
		} else if (!fechaReserva.equals(other.fechaReserva))
			return false;
		if (idAgenda != other.idAgenda)
			return false;
		if (Float.floatToIntBits(precio) != Float.floatToIntBits(other.precio))
			return false;
		if (tipoCita == null) {
			if (other.tipoCita != null)
				return false;
		} else if (!tipoCita.equals(other.tipoCita))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "AgendaCitaMedica [idAgenda=" + idAgenda + ", fechaActual=" + fechaActual + ", fechaReserva="
				+ fechaReserva + ", tipoCita=" + tipoCita + ", estado=" + estado + ", precio=" + precio + "]";
	}
   
}
