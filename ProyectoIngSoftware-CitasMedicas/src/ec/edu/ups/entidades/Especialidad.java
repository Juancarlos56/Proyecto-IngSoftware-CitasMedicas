package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Especialidad
 *
 */
@Entity

public class Especialidad implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "esp_id")
	private int id_Especialidad;

	@Column(name = "esp_nom")
	private int nombre_Especialidad;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "especialidadDeEstudio")
	private List<EstudioMedico> especialidadDeEstudio = new ArrayList<EstudioMedico>();
	
	
	
	public Especialidad() {
		super();
	}   
	
	
	
	
	public Especialidad(int id_Especialidad, int nombre_Especialidad, List<EstudioMedico> especialidadPorEstudio) {
		super();
		this.id_Especialidad = id_Especialidad;
		this.nombre_Especialidad = nombre_Especialidad;
	}




	public int getId_Especialidad() {
		return id_Especialidad;
	}




	public void setId_Especialidad(int id_Especialidad) {
		this.id_Especialidad = id_Especialidad;
	}




	public int getNombre_Especialidad() {
		return nombre_Especialidad;
	}




	public void setNombre_Especialidad(int nombre_Especialidad) {
		this.nombre_Especialidad = nombre_Especialidad;
	}


	public List<EstudioMedico> getEspecialidadDeEstudio() {
		return especialidadDeEstudio;
	}

	

	public void setEspecialidadDeEstudio(List<EstudioMedico> especialidadDeEstudio) {
		this.especialidadDeEstudio = especialidadDeEstudio;
	}

	public void agregarEstudioMedico(EstudioMedico estudioMedico) {
		this.especialidadDeEstudio.add(estudioMedico);
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especialidadDeEstudio == null) ? 0 : especialidadDeEstudio.hashCode());
		result = prime * result + id_Especialidad;
		result = prime * result + nombre_Especialidad;
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
		Especialidad other = (Especialidad) obj;
		if (especialidadDeEstudio == null) {
			if (other.especialidadDeEstudio != null)
				return false;
		} else if (!especialidadDeEstudio.equals(other.especialidadDeEstudio))
			return false;
		if (id_Especialidad != other.id_Especialidad)
			return false;
		if (nombre_Especialidad != other.nombre_Especialidad)
			return false;
		return true;
	}




	@Override
	public String toString() {
		return "Especialidad [id_Especialidad=" + id_Especialidad + ", nombre_Especialidad=" + nombre_Especialidad
				+ ", especialidadDeEstudio=" + especialidadDeEstudio + "]";
	}
	







	

}
