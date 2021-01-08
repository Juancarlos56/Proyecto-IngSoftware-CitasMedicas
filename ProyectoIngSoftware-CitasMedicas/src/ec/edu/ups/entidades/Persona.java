package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *
 */
@Entity

public class Persona implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "per_id")
	private int idFactura;
	
	@Column(name = "per_cedula") 
	private String cedula;
	
	@Column(name = "per_nombre") 
	private String nombre; 
	
	@Column(name = "per_apellido") 
	private String apellido;
	
	@Column(name = "per_lugarNacimiento") 
	private String lugarNacimiento;
	
	@Column(name = "per_fechaNacimiento") 
	private GregorianCalendar fechaDeNacimiento;
	
	@Column(name = "per_nacionalidad") 
	private String nacionalidad;
	
	@Column(name = "per_sexo") 
	private String sexo;
	
	@Column(name = "per_email") 
	private String email;
	
	@Column(name = "per_tipoUsuario") 
	private String tipoUsuario;

	@Column(name = "per_estado") 
	private String estado;
	
	
	public Persona() {
		super();
	}


	public Persona(int idFactura, String cedula, String nombre, String apellido, String lugarNacimiento,
			GregorianCalendar fechaDeNacimiento, String nacionalidad, String sexo, String email, String tipoUsuario,
			String estado) {
		super();
		this.idFactura = idFactura;
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
		this.email = email;
		this.tipoUsuario = tipoUsuario;
		this.estado = estado;
	}

	public Persona(String cedula, String nombre, String apellido, String lugarNacimiento,
			GregorianCalendar fechaDeNacimiento, String nacionalidad, String sexo, String email, String tipoUsuario,
			String estado) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.lugarNacimiento = lugarNacimiento;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.nacionalidad = nacionalidad;
		this.sexo = sexo;
		this.email = email;
		this.tipoUsuario = tipoUsuario;
		this.estado = estado;
	}


	public int getIdFactura() {
		return idFactura;
	}


	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getLugarNacimiento() {
		return lugarNacimiento;
	}


	public void setLugarNacimiento(String lugarNacimiento) {
		this.lugarNacimiento = lugarNacimiento;
	}


	public GregorianCalendar getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(GregorianCalendar fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	public String getNacionalidad() {
		return nacionalidad;
	}


	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTipoUsuario() {
		return tipoUsuario;
	}


	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((fechaDeNacimiento == null) ? 0 : fechaDeNacimiento.hashCode());
		result = prime * result + idFactura;
		result = prime * result + ((lugarNacimiento == null) ? 0 : lugarNacimiento.hashCode());
		result = prime * result + ((nacionalidad == null) ? 0 : nacionalidad.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
		result = prime * result + ((tipoUsuario == null) ? 0 : tipoUsuario.hashCode());
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
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (fechaDeNacimiento == null) {
			if (other.fechaDeNacimiento != null)
				return false;
		} else if (!fechaDeNacimiento.equals(other.fechaDeNacimiento))
			return false;
		if (idFactura != other.idFactura)
			return false;
		if (lugarNacimiento == null) {
			if (other.lugarNacimiento != null)
				return false;
		} else if (!lugarNacimiento.equals(other.lugarNacimiento))
			return false;
		if (nacionalidad == null) {
			if (other.nacionalidad != null)
				return false;
		} else if (!nacionalidad.equals(other.nacionalidad))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		if (tipoUsuario == null) {
			if (other.tipoUsuario != null)
				return false;
		} else if (!tipoUsuario.equals(other.tipoUsuario))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Persona [idFactura=" + idFactura + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", lugarNacimiento=" + lugarNacimiento + ", fechaDeNacimiento=" + fechaDeNacimiento
				+ ", nacionalidad=" + nacionalidad + ", sexo=" + sexo + ", email=" + email + ", tipoUsuario="
				+ tipoUsuario + ", estado=" + estado + "]";
	}
   
	
	
}
