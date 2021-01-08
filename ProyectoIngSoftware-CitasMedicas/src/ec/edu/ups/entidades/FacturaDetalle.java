package ec.edu.ups.entidades;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaDetalle
 *
 */
@Entity

public class FacturaDetalle implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int idFacturaDetalle;
	
	@Column(name="cantidadFacturaDetalle",nullable=false)
	private int cantidadFacturaDetalle;
	
	@Column(name="subtotalFacturaDetalle",nullable=false)
	private double subtotalFacturaDetalle;
	
	@ManyToOne 
    @JoinColumn
    private FacturaCabecera detallesDeFacturaCabecera;
	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "citasDeFacturaDetalle")
    private List<AgendaCitaMedica> citasDeFacturaDetalle=new ArrayList<AgendaCitaMedica>();
	
	public FacturaDetalle() {
		super();
	}



	public FacturaDetalle(int idFacturaDetalle, int cantidadFacturaDetalle, double subtotalFacturaDetalle,
			FacturaCabecera detallesDeFacturaCabecera) {
		super();
		this.idFacturaDetalle = idFacturaDetalle;
		this.cantidadFacturaDetalle = cantidadFacturaDetalle;
		this.subtotalFacturaDetalle = subtotalFacturaDetalle;
		this.detallesDeFacturaCabecera = detallesDeFacturaCabecera;
	}

	public FacturaDetalle(int cantidadFacturaDetalle, double subtotalFacturaDetalle,
			FacturaCabecera detallesDeFacturaCabecera) {
		super();
		this.cantidadFacturaDetalle = cantidadFacturaDetalle;
		this.subtotalFacturaDetalle = subtotalFacturaDetalle;
		this.detallesDeFacturaCabecera = detallesDeFacturaCabecera;
	}



	public void calcularSubtotalFacturaDetalle() {
		
	}
	
	public void addCitaMedica(AgendaCitaMedica citaMedica) {
		getCitasDeFacturaDetalle().add(citaMedica);
	}



	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}



	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}



	public int getCantidadFacturaDetalle() {
		return cantidadFacturaDetalle;
	}



	public void setCantidadFacturaDetalle(int cantidadFacturaDetalle) {
		this.cantidadFacturaDetalle = cantidadFacturaDetalle;
	}



	public double getSubtotalFacturaDetalle() {
		return subtotalFacturaDetalle;
	}



	public void setSubtotalFacturaDetalle(double subtotalFacturaDetalle) {
		this.subtotalFacturaDetalle = subtotalFacturaDetalle;
	}



	public FacturaCabecera getDetallesDeFacturaCabecera() {
		return detallesDeFacturaCabecera;
	}



	public void setDetallesDeFacturaCabecera(FacturaCabecera detallesDeFacturaCabecera) {
		this.detallesDeFacturaCabecera = detallesDeFacturaCabecera;
	}



	public List<AgendaCitaMedica> getCitasDeFacturaDetalle() {
		return citasDeFacturaDetalle;
	}



	public void setCitasDeFacturaDetalle(List<AgendaCitaMedica> citasDeFacturaDetalle) {
		this.citasDeFacturaDetalle = citasDeFacturaDetalle;
	}

	public void agregarFacturaDetalle(AgendaCitaMedica facturaDetalle) {
		this.citasDeFacturaDetalle.add(facturaDetalle);
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidadFacturaDetalle;
		result = prime * result + ((detallesDeFacturaCabecera == null) ? 0 : detallesDeFacturaCabecera.hashCode());
		result = prime * result + idFacturaDetalle;
		long temp;
		temp = Double.doubleToLongBits(subtotalFacturaDetalle);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		FacturaDetalle other = (FacturaDetalle) obj;
		if (cantidadFacturaDetalle != other.cantidadFacturaDetalle)
			return false;
		if (detallesDeFacturaCabecera == null) {
			if (other.detallesDeFacturaCabecera != null)
				return false;
		} else if (!detallesDeFacturaCabecera.equals(other.detallesDeFacturaCabecera))
			return false;
		if (idFacturaDetalle != other.idFacturaDetalle)
			return false;
		if (Double.doubleToLongBits(subtotalFacturaDetalle) != Double.doubleToLongBits(other.subtotalFacturaDetalle))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", cantidadFacturaDetalle="
				+ cantidadFacturaDetalle + ", subtotalFacturaDetalle=" + subtotalFacturaDetalle
				+ ", detallesDeFacturaCabecera=" + detallesDeFacturaCabecera+ "]";
	}



	
}
