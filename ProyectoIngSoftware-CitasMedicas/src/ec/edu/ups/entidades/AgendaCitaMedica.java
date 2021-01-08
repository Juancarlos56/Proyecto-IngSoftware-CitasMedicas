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
	@Column(name = "idAgendaCitaMedica")
	private int idAgendaCitaMedica;
	
	@Column(name = "fechaActualDeAgendaCitaMedica")
	private GregorianCalendar fechaActualDeAgendaCitaMedica;
	
	@Column(name = "fechaReservaDeAgendaCitaMedica")
	private GregorianCalendar fechaReservaDeAgendaCitaMedica;
	
	@Column(name = "tipoCitaDeAgendaCitaMedica")
	private String tipoCitaDeAgendaCitaMedica;
	
	@Column(name = "estadoDeAgendaCitaMedica")
	private String estadoDeAgendaCitaMedica;
	
	@Column(name = "precioDeAgendaCitaMedica")
	private float precioDeAgendaCitaMedica;
	
	@ManyToOne
	@JoinColumn(name = "FK_Secretaria_AgendaCita")
	private Secretaria secretariaAgendaCita;
	
	@ManyToOne
	@JoinColumn(name = "FK_Medico_AgendaCita")
	private Medico medicoParaCitaMedica;
	
	@ManyToOne
	@JoinColumn(name = "FK_Paciente_AgendaCita")
	private Paciente pacienteCitaMedica;
	
	@ManyToOne
	@JoinColumn(name = "FK_FacturaDetalle_AgendaCita")
	private FacturaDetalle citasDeFacturaDetalle;
	
	public AgendaCitaMedica() {
		super();
	}

	
	public AgendaCitaMedica(int idAgendaCitaMedica, GregorianCalendar fechaActualDeAgendaCitaMedica,
			GregorianCalendar fechaReservaDeAgendaCitaMedica, String tipoCitaDeAgendaCitaMedica,
			String estadoDeAgendaCitaMedica, float precioDeAgendaCitaMedica, Secretaria secretariaAgendaCita,
			Medico medico, Paciente pacienteCitaMedica, FacturaDetalle citasDeFacturaDetalle) {
		super();
		this.idAgendaCitaMedica = idAgendaCitaMedica;
		this.fechaActualDeAgendaCitaMedica = fechaActualDeAgendaCitaMedica;
		this.fechaReservaDeAgendaCitaMedica = fechaReservaDeAgendaCitaMedica;
		this.tipoCitaDeAgendaCitaMedica = tipoCitaDeAgendaCitaMedica;
		this.estadoDeAgendaCitaMedica = estadoDeAgendaCitaMedica;
		this.precioDeAgendaCitaMedica = precioDeAgendaCitaMedica;
		this.secretariaAgendaCita = secretariaAgendaCita;
		this.medicoParaCitaMedica = medico;
		this.pacienteCitaMedica = pacienteCitaMedica;
		this.citasDeFacturaDetalle = citasDeFacturaDetalle;
	}



	//Contructor sin ID por autogeneracion del codigo 

	public AgendaCitaMedica(GregorianCalendar fechaActualDeAgendaCitaMedica,
			GregorianCalendar fechaReservaDeAgendaCitaMedica, String tipoCitaDeAgendaCitaMedica,
			String estadoDeAgendaCitaMedica, float precioDeAgendaCitaMedica, Secretaria secretariaAgendaCita,
			Medico medico, Paciente pacienteCitaMedica, FacturaDetalle citasDeFacturaDetalle) {
		super();
		this.fechaActualDeAgendaCitaMedica = fechaActualDeAgendaCitaMedica;
		this.fechaReservaDeAgendaCitaMedica = fechaReservaDeAgendaCitaMedica;
		this.tipoCitaDeAgendaCitaMedica = tipoCitaDeAgendaCitaMedica;
		this.estadoDeAgendaCitaMedica = estadoDeAgendaCitaMedica;
		this.precioDeAgendaCitaMedica = precioDeAgendaCitaMedica;
		this.secretariaAgendaCita = secretariaAgendaCita;
		this.medicoParaCitaMedica = medico;
		this.pacienteCitaMedica = pacienteCitaMedica;
		this.citasDeFacturaDetalle = citasDeFacturaDetalle;
	}


	public int getIdAgendaCitaMedica() {
		return idAgendaCitaMedica;
	}

	public void setIdAgendaCitaMedica(int idAgendaCitaMedica) {
		this.idAgendaCitaMedica = idAgendaCitaMedica;
	}

	public GregorianCalendar getFechaActualDeAgendaCitaMedica() {
		return fechaActualDeAgendaCitaMedica;
	}

	public void setFechaActualDeAgendaCitaMedica(GregorianCalendar fechaActualDeAgendaCitaMedica) {
		this.fechaActualDeAgendaCitaMedica = fechaActualDeAgendaCitaMedica;
	}

	public GregorianCalendar getFechaReservaDeAgendaCitaMedica() {
		return fechaReservaDeAgendaCitaMedica;
	}

	public void setFechaReservaDeAgendaCitaMedica(GregorianCalendar fechaReservaDeAgendaCitaMedica) {
		this.fechaReservaDeAgendaCitaMedica = fechaReservaDeAgendaCitaMedica;
	}

	public String getTipoCitaDeAgendaCitaMedica() {
		return tipoCitaDeAgendaCitaMedica;
	}

	public void setTipoCitaDeAgendaCitaMedica(String tipoCitaDeAgendaCitaMedica) {
		this.tipoCitaDeAgendaCitaMedica = tipoCitaDeAgendaCitaMedica;
	}

	public String getEstadoDeAgendaCitaMedica() {
		return estadoDeAgendaCitaMedica;
	}

	public void setEstadoDeAgendaCitaMedica(String estadoDeAgendaCitaMedica) {
		this.estadoDeAgendaCitaMedica = estadoDeAgendaCitaMedica;
	}

	public float getPrecioDeAgendaCitaMedica() {
		return precioDeAgendaCitaMedica;
	}

	public void setPrecioDeAgendaCitaMedica(float precioDeAgendaCitaMedica) {
		this.precioDeAgendaCitaMedica = precioDeAgendaCitaMedica;
	}

	
	public Secretaria getSecretaria() {
		return secretariaAgendaCita;
	}

	public void setSecretaria(Secretaria secretaria) {
		this.secretariaAgendaCita = secretaria;
	}

	public Medico getMedico() {
		return medicoParaCitaMedica;
	}

	public void setMedico(Medico medico) {
		this.medicoParaCitaMedica = medico;
	}

	public Paciente getPacienteCitaMedica() {
		return pacienteCitaMedica;
	}

	public void setPacienteCitaMedica(Paciente paciente) {
		this.pacienteCitaMedica = paciente;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((estadoDeAgendaCitaMedica == null) ? 0 : estadoDeAgendaCitaMedica.hashCode());
		result = prime * result
				+ ((fechaActualDeAgendaCitaMedica == null) ? 0 : fechaActualDeAgendaCitaMedica.hashCode());
		result = prime * result
				+ ((fechaReservaDeAgendaCitaMedica == null) ? 0 : fechaReservaDeAgendaCitaMedica.hashCode());
		result = prime * result + idAgendaCitaMedica;
		result = prime * result + ((pacienteCitaMedica == null) ? 0 : pacienteCitaMedica.hashCode());
		result = prime * result + Float.floatToIntBits(precioDeAgendaCitaMedica);
		result = prime * result + ((tipoCitaDeAgendaCitaMedica == null) ? 0 : tipoCitaDeAgendaCitaMedica.hashCode());
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
		if (estadoDeAgendaCitaMedica == null) {
			if (other.estadoDeAgendaCitaMedica != null)
				return false;
		} else if (!estadoDeAgendaCitaMedica.equals(other.estadoDeAgendaCitaMedica))
			return false;
		if (fechaActualDeAgendaCitaMedica == null) {
			if (other.fechaActualDeAgendaCitaMedica != null)
				return false;
		} else if (!fechaActualDeAgendaCitaMedica.equals(other.fechaActualDeAgendaCitaMedica))
			return false;
		if (fechaReservaDeAgendaCitaMedica == null) {
			if (other.fechaReservaDeAgendaCitaMedica != null)
				return false;
		} else if (!fechaReservaDeAgendaCitaMedica.equals(other.fechaReservaDeAgendaCitaMedica))
			return false;
		if (idAgendaCitaMedica != other.idAgendaCitaMedica)
			return false;
		if (pacienteCitaMedica == null) {
			if (other.pacienteCitaMedica != null)
				return false;
		} else if (!pacienteCitaMedica.equals(other.pacienteCitaMedica))
			return false;
		if (Float.floatToIntBits(precioDeAgendaCitaMedica) != Float.floatToIntBits(other.precioDeAgendaCitaMedica))
			return false;
		if (tipoCitaDeAgendaCitaMedica == null) {
			if (other.tipoCitaDeAgendaCitaMedica != null)
				return false;
		} else if (!tipoCitaDeAgendaCitaMedica.equals(other.tipoCitaDeAgendaCitaMedica))
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "AgendaCitaMedica [idAgendaCitaMedica=" + idAgendaCitaMedica + ", fechaActualDeAgendaCitaMedica="
				+ fechaActualDeAgendaCitaMedica + ", fechaReservaDeAgendaCitaMedica=" + fechaReservaDeAgendaCitaMedica
				+ ", tipoCitaDeAgendaCitaMedica=" + tipoCitaDeAgendaCitaMedica + ", estadoDeAgendaCitaMedica="
				+ estadoDeAgendaCitaMedica + ", precioDeAgendaCitaMedica=" + precioDeAgendaCitaMedica
				+ ", pacienteCitaMedica=" + pacienteCitaMedica + "]";
	}

	
	
   
}
