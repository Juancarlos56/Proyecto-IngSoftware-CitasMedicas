package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistoralMedico
 *
 */
@Entity

public class HistorialMedico implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idHistorial")
	private int idHistorial;
	
	@Column(name = "anamnesisDeUnPaciente", length = 255, nullable = true)
	private String anamnesis;
	
	@Column(name = "examenFisicoDeUnPaciente", length = 255, nullable = true)
	private String examenFisico;
	
	@Column(name = "examenSemiologicoDeUnPaciente", length = 255, nullable = true)
	private String examenSemiologico;
	
	@Column(name = "diagnosticoPresuntivoDeUnPaciente", length = 255, nullable = true)
	private String diagnosticoPresuntivo;
	
	@Column(name = "metodosComplementariosDeUnPaciente", length = 255, nullable = true)
	private String metodosComplementarios;
	
	@Column(name = "evolucionDiariaDeUnPaciente", length = 255, nullable = true)
	private String evolucionDiaria;
	
	@Column(name = "epicrisisDeUnPaciente", length = 255, nullable = true)
	private String epicrisis;
	
	@Column(name = "FechaDeHistoriaMedica", length = 255, nullable = true)
	private Date fecha;
	
	@Column(name = "medicacionActualDeUnPaciente", length = 255, nullable = true)
	private String medicacionActual;
	
	@Column(name = "enfermedadesActualesDeUnPaciente", length = 255, nullable = true)
	private String enfermedadesActuales;
	
	@Column(name = "pesoDeUnPaciente", nullable = false)
	private float peso;
	
	@Column(name = "IMC_DeUnPaciente", nullable = false)
	private float IMC;
	
	
	@ManyToOne
	@JoinColumn(name = "FK_Paciente_Historial")
	private Paciente historialDelPaciente;


	public HistorialMedico() {
		super();
	}

	
	//Contructor sin codigo por autogeneracion
	public HistorialMedico(String anamnesis, String examenFisico, String examenSemiologico,
			String diagnosticoPresuntivo, String metodosComplementarios, String evolucionDiaria, String epicrisis,
			Date fecha, String medicacionActual, String enfermedadesActuales, float peso, float iMC,
			Paciente historialDelPaciente) {
		super();
		this.anamnesis = anamnesis;
		this.examenFisico = examenFisico;
		this.examenSemiologico = examenSemiologico;
		this.diagnosticoPresuntivo = diagnosticoPresuntivo;
		this.metodosComplementarios = metodosComplementarios;
		this.evolucionDiaria = evolucionDiaria;
		this.epicrisis = epicrisis;
		this.fecha = fecha;
		this.medicacionActual = medicacionActual;
		this.enfermedadesActuales = enfermedadesActuales;
		this.peso = peso;
		IMC = iMC;
		this.historialDelPaciente = historialDelPaciente;
	}
	
	
	
	

	public HistorialMedico(int idHistorial, String anamnesis, String examenFisico, String examenSemiologico,
			String diagnosticoPresuntivo, String metodosComplementarios, String evolucionDiaria, String epicrisis,
			Date fecha, String medicacionActual, String enfermedadesActuales, float peso, float iMC,
			Paciente historialDelPaciente) {
		super();
		this.idHistorial = idHistorial;
		this.anamnesis = anamnesis;
		this.examenFisico = examenFisico;
		this.examenSemiologico = examenSemiologico;
		this.diagnosticoPresuntivo = diagnosticoPresuntivo;
		this.metodosComplementarios = metodosComplementarios;
		this.evolucionDiaria = evolucionDiaria;
		this.epicrisis = epicrisis;
		this.fecha = fecha;
		this.medicacionActual = medicacionActual;
		this.enfermedadesActuales = enfermedadesActuales;
		this.peso = peso;
		IMC = iMC;
		this.historialDelPaciente = historialDelPaciente;
	}



	public int getIdHistorial() {
		return idHistorial;
	}


	public void setIdHistorial(int idHistorial) {
		this.idHistorial = idHistorial;
	}


	public String getAnamnesis() {
		return anamnesis;
	}


	public void setAnamnesis(String anamnesis) {
		this.anamnesis = anamnesis;
	}


	public String getExamenFisico() {
		return examenFisico;
	}


	public void setExamenFisico(String examenFisico) {
		this.examenFisico = examenFisico;
	}


	public String getExamenSemiologico() {
		return examenSemiologico;
	}


	public void setExamenSemiologico(String examenSemiologico) {
		this.examenSemiologico = examenSemiologico;
	}


	public String getDiagnosticoPresuntivo() {
		return diagnosticoPresuntivo;
	}


	public void setDiagnosticoPresuntivo(String diagnosticoPresuntivo) {
		this.diagnosticoPresuntivo = diagnosticoPresuntivo;
	}


	public String getMetodosComplementarios() {
		return metodosComplementarios;
	}


	public void setMetodosComplementarios(String metodosComplementarios) {
		this.metodosComplementarios = metodosComplementarios;
	}


	public String getEvolucionDiaria() {
		return evolucionDiaria;
	}


	public void setEvolucionDiaria(String evolucionDiaria) {
		this.evolucionDiaria = evolucionDiaria;
	}


	public String getEpicrisis() {
		return epicrisis;
	}


	public void setEpicrisis(String epicrisis) {
		this.epicrisis = epicrisis;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public String getMedicacionActual() {
		return medicacionActual;
	}


	public void setMedicacionActual(String medicacionActual) {
		this.medicacionActual = medicacionActual;
	}


	public String getEnfermedadesActuales() {
		return enfermedadesActuales;
	}


	public void setEnfermedadesActuales(String enfermedadesActuales) {
		this.enfermedadesActuales = enfermedadesActuales;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}


	public float getIMC() {
		return IMC;
	}


	public void setIMC(float iMC) {
		IMC = iMC;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(IMC);
		result = prime * result + ((anamnesis == null) ? 0 : anamnesis.hashCode());
		result = prime * result + ((diagnosticoPresuntivo == null) ? 0 : diagnosticoPresuntivo.hashCode());
		result = prime * result + ((enfermedadesActuales == null) ? 0 : enfermedadesActuales.hashCode());
		result = prime * result + ((epicrisis == null) ? 0 : epicrisis.hashCode());
		result = prime * result + ((evolucionDiaria == null) ? 0 : evolucionDiaria.hashCode());
		result = prime * result + ((examenFisico == null) ? 0 : examenFisico.hashCode());
		result = prime * result + ((examenSemiologico == null) ? 0 : examenSemiologico.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + idHistorial;
		result = prime * result + ((medicacionActual == null) ? 0 : medicacionActual.hashCode());
		result = prime * result + ((metodosComplementarios == null) ? 0 : metodosComplementarios.hashCode());
		result = prime * result + Float.floatToIntBits(peso);
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
		HistorialMedico other = (HistorialMedico) obj;
		if (Float.floatToIntBits(IMC) != Float.floatToIntBits(other.IMC))
			return false;
		if (anamnesis == null) {
			if (other.anamnesis != null)
				return false;
		} else if (!anamnesis.equals(other.anamnesis))
			return false;
		if (diagnosticoPresuntivo == null) {
			if (other.diagnosticoPresuntivo != null)
				return false;
		} else if (!diagnosticoPresuntivo.equals(other.diagnosticoPresuntivo))
			return false;
		if (enfermedadesActuales == null) {
			if (other.enfermedadesActuales != null)
				return false;
		} else if (!enfermedadesActuales.equals(other.enfermedadesActuales))
			return false;
		if (epicrisis == null) {
			if (other.epicrisis != null)
				return false;
		} else if (!epicrisis.equals(other.epicrisis))
			return false;
		if (evolucionDiaria == null) {
			if (other.evolucionDiaria != null)
				return false;
		} else if (!evolucionDiaria.equals(other.evolucionDiaria))
			return false;
		if (examenFisico == null) {
			if (other.examenFisico != null)
				return false;
		} else if (!examenFisico.equals(other.examenFisico))
			return false;
		if (examenSemiologico == null) {
			if (other.examenSemiologico != null)
				return false;
		} else if (!examenSemiologico.equals(other.examenSemiologico))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idHistorial != other.idHistorial)
			return false;
		if (medicacionActual == null) {
			if (other.medicacionActual != null)
				return false;
		} else if (!medicacionActual.equals(other.medicacionActual))
			return false;
		if (metodosComplementarios == null) {
			if (other.metodosComplementarios != null)
				return false;
		} else if (!metodosComplementarios.equals(other.metodosComplementarios))
			return false;
		if (Float.floatToIntBits(peso) != Float.floatToIntBits(other.peso))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "HistorialMedico [idHistorial=" + idHistorial + ", anamnesis=" + anamnesis + ", examenFisico="
				+ examenFisico + ", examenSemiologico=" + examenSemiologico + ", diagnosticoPresuntivo="
				+ diagnosticoPresuntivo + ", metodosComplementarios=" + metodosComplementarios + ", evolucionDiaria="
				+ evolucionDiaria + ", epicrisis=" + epicrisis + ", fecha=" + fecha + ", medicacionActual="
				+ medicacionActual + ", enfermedadesActuales=" + enfermedadesActuales + ", peso=" + peso + ", IMC="
				+ IMC + ", historialDelPaciente=" + historialDelPaciente + "]";
	}
   
	
}

