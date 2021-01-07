package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Consulta
 *
 */
@Entity

public class Consulta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idConsulta")
	private int idConsulta;
	
	@Column(name = "fechaActualDeLaConsulta")
	private GregorianCalendar fechaActualDeLaConsulta;
	
	@Column(name = "sintomasDelPaciente", length = 255, nullable = false)
	private String sintomasDelPaciente;
	
	@Column(name = "diagnosticoDeLaConsulta", length = 255, nullable = false)
	private String diagnosticoDeLaConsulta;
	
	@Column(name = "observacionesDeLaConsulta", length = 255, nullable = false)
	private String observacionesDeLaConsulta;
	
	@Column(name = "medicinasRecetadasParaElPaciente", length = 255, nullable = false)
	private String medicinasParaElPaciente;
	
	@Column(name = "dosisRecetadaParaElPaciente", length = 255, nullable = false)
	private String dosis;
	
	
	@ManyToOne
	@JoinColumn(name = "FK_Paciente_Consulta")
	private Paciente pacienteConsulta;
	
	@ManyToOne
	@JoinColumn(name = "FK_Medico_Consulta")
	private Medico medicoConsulta;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "certificadoDeUnaConsulta")
	private Certificado certificadoMedicoParaConsulta;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "ordenesMedicasDeUnaConsulta")
	private List<OrdenMedica> ordenesMedicasDeConsulta = new ArrayList<OrdenMedica>();
	
	
	public Consulta() {
		super();
	}


	public Consulta(GregorianCalendar fechaActualDeLaConsulta, String sintomasDelPaciente,
			String diagnosticoDeLaConsulta, String observacionesDeLaConsulta, String medicinasParaElPaciente,
			String dosis, Paciente pacienteConsulta, Medico medicoConsulta, Certificado certificadoMedicoParaConsulta) {
		super();
		
		this.fechaActualDeLaConsulta = fechaActualDeLaConsulta;
		this.sintomasDelPaciente = sintomasDelPaciente;
		this.diagnosticoDeLaConsulta = diagnosticoDeLaConsulta;
		this.observacionesDeLaConsulta = observacionesDeLaConsulta;
		this.medicinasParaElPaciente = medicinasParaElPaciente;
		this.dosis = dosis;
		this.pacienteConsulta = pacienteConsulta;
		this.medicoConsulta = medicoConsulta;
		this.certificadoMedicoParaConsulta = certificadoMedicoParaConsulta;
	}


	public int getIdConsulta() {
		return idConsulta;
	}


	public void setIdConsulta(int idConsulta) {
		this.idConsulta = idConsulta;
	}


	public GregorianCalendar getFechaActualDeLaConsulta() {
		return fechaActualDeLaConsulta;
	}


	public void setFechaActualDeLaConsulta(GregorianCalendar fechaActualDeLaConsulta) {
		this.fechaActualDeLaConsulta = fechaActualDeLaConsulta;
	}


	public String getSintomasDelPaciente() {
		return sintomasDelPaciente;
	}


	public void setSintomasDelPaciente(String sintomasDelPaciente) {
		this.sintomasDelPaciente = sintomasDelPaciente;
	}


	public String getDiagnosticoDeLaConsulta() {
		return diagnosticoDeLaConsulta;
	}


	public void setDiagnosticoDeLaConsulta(String diagnosticoDeLaConsulta) {
		this.diagnosticoDeLaConsulta = diagnosticoDeLaConsulta;
	}


	public String getObservacionesDeLaConsulta() {
		return observacionesDeLaConsulta;
	}


	public void setObservacionesDeLaConsulta(String observacionesDeLaConsulta) {
		this.observacionesDeLaConsulta = observacionesDeLaConsulta;
	}


	public String getMedicinasParaElPaciente() {
		return medicinasParaElPaciente;
	}


	public void setMedicinasParaElPaciente(String medicinasParaElPaciente) {
		this.medicinasParaElPaciente = medicinasParaElPaciente;
	}


	public String getDosis() {
		return dosis;
	}


	public void setDosis(String dosis) {
		this.dosis = dosis;
	}


	public Paciente getPacienteConsulta() {
		return pacienteConsulta;
	}


	public void setPacienteConsulta(Paciente pacienteConsulta) {
		this.pacienteConsulta = pacienteConsulta;
	}


	public Medico getMedicoConsulta() {
		return medicoConsulta;
	}


	public void setMedicoConsulta(Medico medicoConsulta) {
		this.medicoConsulta = medicoConsulta;
	}


	public Certificado getCertificadoMedicoParaConsulta() {
		return certificadoMedicoParaConsulta;
	}


	public void setCertificadoMedicoParaConsulta(Certificado certificadoMedicoParaConsulta) {
		this.certificadoMedicoParaConsulta = certificadoMedicoParaConsulta;
	}


	public List<OrdenMedica> getOrdenesMedicasDeConsulta() {
		return ordenesMedicasDeConsulta;
	}


	public void setOrdenesMedicasDeConsulta(List<OrdenMedica> ordenesMedicasDeConsulta) {
		this.ordenesMedicasDeConsulta = ordenesMedicasDeConsulta;
	}
	
	public void agregarOrdenMedica(OrdenMedica ordenMedica) {
		this.ordenesMedicasDeConsulta.add(ordenMedica);
	}

	

}
