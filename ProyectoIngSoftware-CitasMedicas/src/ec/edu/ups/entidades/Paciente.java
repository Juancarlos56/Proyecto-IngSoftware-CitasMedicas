package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 *
 */
@Entity

public class Paciente implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPaciente")
	private int idPaciente;
	
	@Column(name = "tipoSangrePaciente", nullable = true)
	private String tipoSangre;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "historialDelPaciente")
	private List<HistorialMedico> historialesDePaciente = new ArrayList<HistorialMedico>();

	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteCitaMedica")
    private List<AgendaCitaMedica> citasDeUnPaciente=new ArrayList<AgendaCitaMedica>();
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteConsulta")
    private List<Consulta> consultasDeUnPaciente=new ArrayList<Consulta>();
	
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

	public List<HistorialMedico> getHistorialMedico() {
		return historialesDePaciente;
	}

	public void setHistorialMedico(List<HistorialMedico> historialMedico) {
		this.historialesDePaciente = historialMedico;
	}
	
	public void agregarHistoralMedico(HistorialMedico historialMedico) {
		this.historialesDePaciente.add(historialMedico);
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
