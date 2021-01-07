package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Certificado
 *
 */
@Entity

public class Certificado implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int idCertificado;
	private Date fecha;
	private int numeroDiasDeReposo;
	private String descripcion;
	
	

	public int getIdCertificado() {
		return idCertificado;
	}



	public void setIdCertificado(int idCertificado) {
		this.idCertificado = idCertificado;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public int getNumeroDiasDeReposo() {
		return numeroDiasDeReposo;
	}



	public void setNumeroDiasDeReposo(int numeroDiasDeReposo) {
		this.numeroDiasDeReposo = numeroDiasDeReposo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Certificado() {
		super();
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descripcion == null) ? 0 : descripcion.hashCode());
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + idCertificado;
		result = prime * result + numeroDiasDeReposo;
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
		Certificado other = (Certificado) obj;
		if (descripcion == null) {
			if (other.descripcion != null)
				return false;
		} else if (!descripcion.equals(other.descripcion))
			return false;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (idCertificado != other.idCertificado)
			return false;
		if (numeroDiasDeReposo != other.numeroDiasDeReposo)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "Certificado [idCertificado=" + idCertificado + ", fecha=" + fecha + ", numDiaresp=" + numDiaresp
				+ ", descripcion=" + descripcion + "]";
	}
   
}
