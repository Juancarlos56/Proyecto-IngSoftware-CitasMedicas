package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Horario_Medico
 *
 */
@Entity

public class HorarioMedico implements Serializable {

	 
	private static final long serialVersionUID = 1L;

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "horario_medico_id")
	private int id_horarioMedico;
	
	@Column(name = "horario_medico_dia")
	private GregorianCalendar diaHorarioMedico;
	
	@Column(name = "horario_medico_horaInicio")
	private GregorianCalendar horaInicioHorarioMedico;
	
	@Column(name = "horario_medico_horaFin")
	private GregorianCalendar horaFinHorarioMedico;
	
	@Column(name = "horario_medico_estado")
	private String estadoHorarioMedico;
	
	@ManyToOne 
	@JoinColumn (name = "FK_Horario_Medico")
	private Medico horarioDisponiblePorMedico;
	

	
	public HorarioMedico() {
		super();
	}   

	
	
	
	public HorarioMedico(int id_horarioMedico, GregorianCalendar diaHorarioMedico,
			GregorianCalendar horaInicioHorarioMedico, GregorianCalendar horaFinHorarioMedico,
			String estadoHorarioMedico, Medico horarioDisponiblePorMedico) {
		super();
		this.id_horarioMedico = id_horarioMedico;
		this.diaHorarioMedico = diaHorarioMedico;
		this.horaInicioHorarioMedico = horaInicioHorarioMedico;
		this.horaFinHorarioMedico = horaFinHorarioMedico;
		this.estadoHorarioMedico = estadoHorarioMedico;
		this.horarioDisponiblePorMedico = horarioDisponiblePorMedico;
	}


	

	public HorarioMedico obtenerHorarioPorDia() {
		return null;
	}

	
	
	
	public int getId_horarioMedico() {
		return id_horarioMedico;
	}

	public void setId_horarioMedico(int id_horarioMedico) {
		this.id_horarioMedico = id_horarioMedico;
	}

	public GregorianCalendar getDiaHorarioMedico() {
		return diaHorarioMedico;
	}

	public void setDiaHorarioMedico(GregorianCalendar diaHorarioMedico) {
		this.diaHorarioMedico = diaHorarioMedico;
	}

	public GregorianCalendar getHoraInicioHorarioMedico() {
		return horaInicioHorarioMedico;
	}

	public void setHoraInicioHorarioMedico(GregorianCalendar horaInicioHorarioMedico) {
		this.horaInicioHorarioMedico = horaInicioHorarioMedico;
	}

	public GregorianCalendar getHoraFinHorarioMedico() {
		return horaFinHorarioMedico;
	}

	public void setHoraFinHorarioMedico(GregorianCalendar horaFinHorarioMedico) {
		this.horaFinHorarioMedico = horaFinHorarioMedico;
	}

	public String getEstadoHorarioMedico() {
		return estadoHorarioMedico;
	}

	public void setEstadoHorarioMedico(String estadoHorarioMedico) {
		this.estadoHorarioMedico = estadoHorarioMedico;
	}

	public Medico getHorarioDisponiblePorMedico() {
		return horarioDisponiblePorMedico;
	}

	public void setHorarioDisponiblePorMedico(Medico horarioDisponiblePorMedico) {
		this.horarioDisponiblePorMedico = horarioDisponiblePorMedico;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((diaHorarioMedico == null) ? 0 : diaHorarioMedico.hashCode());
		result = prime * result + ((estadoHorarioMedico == null) ? 0 : estadoHorarioMedico.hashCode());
		result = prime * result + ((horaFinHorarioMedico == null) ? 0 : horaFinHorarioMedico.hashCode());
		result = prime * result + ((horaInicioHorarioMedico == null) ? 0 : horaInicioHorarioMedico.hashCode());
		result = prime * result + ((horarioDisponiblePorMedico == null) ? 0 : horarioDisponiblePorMedico.hashCode());
		result = prime * result + id_horarioMedico;
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
		HorarioMedico other = (HorarioMedico) obj;
		if (diaHorarioMedico == null) {
			if (other.diaHorarioMedico != null)
				return false;
		} else if (!diaHorarioMedico.equals(other.diaHorarioMedico))
			return false;
		if (estadoHorarioMedico == null) {
			if (other.estadoHorarioMedico != null)
				return false;
		} else if (!estadoHorarioMedico.equals(other.estadoHorarioMedico))
			return false;
		if (horaFinHorarioMedico == null) {
			if (other.horaFinHorarioMedico != null)
				return false;
		} else if (!horaFinHorarioMedico.equals(other.horaFinHorarioMedico))
			return false;
		if (horaInicioHorarioMedico == null) {
			if (other.horaInicioHorarioMedico != null)
				return false;
		} else if (!horaInicioHorarioMedico.equals(other.horaInicioHorarioMedico))
			return false;
		if (horarioDisponiblePorMedico == null) {
			if (other.horarioDisponiblePorMedico != null)
				return false;
		} else if (!horarioDisponiblePorMedico.equals(other.horarioDisponiblePorMedico))
			return false;
		if (id_horarioMedico != other.id_horarioMedico)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Horario_Medico [id_horarioMedico=" + id_horarioMedico + ", diaHorarioMedico=" + diaHorarioMedico
				+ ", horaInicioHorarioMedico=" + horaInicioHorarioMedico + ", horaFinHorarioMedico="
				+ horaFinHorarioMedico + ", estadoHorarioMedico=" + estadoHorarioMedico
				+ ", horarioDisponiblePorMedico=" + horarioDisponiblePorMedico + "]";
	}
	
	
	
	
   
}
