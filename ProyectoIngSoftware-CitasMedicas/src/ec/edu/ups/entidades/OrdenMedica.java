package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Orden
 *
 */
@Entity

public class OrdenMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ord_med_id")
	private int idOrdenMedica;
	
	@Column(name="ord_med_descripcion", length=20, nullable=false)
	private String descripcion;
	
	@Column(name="ord_med_diagnostico", length=20, nullable=false)
	private String diagnostico;
	
	
	@Column(name="ord_med_fecha", length=20, nullable=false)
	private Date fechaOrdenMedica;
	
	@ManyToOne
	@JoinColumn(name = "FK_OrdenMedica_Consulta")
	private Paciente ordenesMedicasDeUnaConsulta;

	
	public OrdenMedica() {
		super();
	}

	public OrdenMedica(int idOrdenMedica, String descripcion, String diagnostico, Date fechaOrdenMedica,
			Paciente ordenesMedicasDeUnaConsulta) {
		super();
		this.idOrdenMedica = idOrdenMedica;
		this.descripcion = descripcion;
		this.diagnostico = diagnostico;
		this.fechaOrdenMedica = fechaOrdenMedica;
		this.ordenesMedicasDeUnaConsulta = ordenesMedicasDeUnaConsulta;
	}
	
	//Constructor para orden medica sin codigo por autogeneracion
	public OrdenMedica(String descripcion, String diagnostico, Date fechaOrdenMedica,
			Paciente ordenesMedicasDeUnaConsulta) {
		super();
		this.descripcion = descripcion;
		this.diagnostico = diagnostico;
		this.fechaOrdenMedica = fechaOrdenMedica;
		this.ordenesMedicasDeUnaConsulta = ordenesMedicasDeUnaConsulta;
	}

	public int getIdOrdenMedica() {
		return idOrdenMedica;
	}


	public void setIdOrdenMedica(int idOrdenMedica) {
		this.idOrdenMedica = idOrdenMedica;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getDiagnostico() {
		return diagnostico;
	}


	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}


	public Date getFechaOrdenMedica() {
		return fechaOrdenMedica;
	}


	public void setFechaOrdenMedica(Date fechaOrdenMedica) {
		this.fechaOrdenMedica = fechaOrdenMedica;
	}


	public Paciente getOrdenesMedicasDeUnaConsulta() {
		return ordenesMedicasDeUnaConsulta;
	}


	public void setOrdenesMedicasDeUnaConsulta(Paciente ordenesMedicasDeUnaConsulta) {
		this.ordenesMedicasDeUnaConsulta = ordenesMedicasDeUnaConsulta;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((diagnostico == null) ? 0 : diagnostico.hashCode());
		result = prime * result + ((fechaOrdenMedica == null) ? 0 : fechaOrdenMedica.hashCode());
		result = prime * result + idOrdenMedica;
		result = prime * result + ((ordenesMedicasDeUnaConsulta == null) ? 0 : ordenesMedicasDeUnaConsulta.hashCode());
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
		OrdenMedica other = (OrdenMedica) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (diagnostico == null) {
			if (other.diagnostico != null)
				return false;
		} else if (!diagnostico.equals(other.diagnostico))
			return false;
		if (fechaOrdenMedica == null) {
			if (other.fechaOrdenMedica != null)
				return false;
		} else if (!fechaOrdenMedica.equals(other.fechaOrdenMedica))
			return false;
		if (idOrdenMedica != other.idOrdenMedica)
			return false;
		if (ordenesMedicasDeUnaConsulta == null) {
			if (other.ordenesMedicasDeUnaConsulta != null)
				return false;
		} else if (!ordenesMedicasDeUnaConsulta.equals(other.ordenesMedicasDeUnaConsulta))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "OrdenMedica [idOrdenMedica=" + idOrdenMedica + ", descripcion=" + descripcion + ", diagnostico="
				+ diagnostico + ", fechaOrdenMedica=" + fechaOrdenMedica + ", ordenesMedicasDeUnaConsulta="
				+ ordenesMedicasDeUnaConsulta + "]";
	}
	
	
   
}
