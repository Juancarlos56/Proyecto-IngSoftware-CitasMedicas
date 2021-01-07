package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaCompra
 *
 */
@Entity

public class FacturaCompra extends FacturaGeneral<FacturaCompra> implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	@Column(name="cantidadFacturaCompra",nullable=false)
	private int cantidadFacturaCompra;
	
	@Column(name="subtotalFacturaCompra",nullable=false)
	private double precioUnitario;
	
	public FacturaCompra() {
		super();
	}


	public FacturaCompra(GregorianCalendar fecha, String descripcion, String tipoTransaccion,
			char estado, double subtotal, double iva, double total, String tipoFactura, 
			int cantidadFacturaCompra, double precioUnitario) {
		
		super(fecha, descripcion, tipoTransaccion, estado, subtotal, iva, total, tipoFactura);
		this.cantidadFacturaCompra = cantidadFacturaCompra;
		this.precioUnitario = precioUnitario;
	}


	
   
	public double calcularSubtotal() {
		return super.calcularSubtotal();
	}
	
	
	public double calcularTotalFactura() {
		return super.calcularTotalFactura();
	}
	
	
	public double calcularValorFactura() {
		return super.calcularValorFactura();
	}

	@Override
	public boolean actualizarCajaDiaria(FacturaCompra factura, CajaDiaria cajaDiaria) {
		// TODO Auto-generated method stub
		return false;
	}


	public int getCantidadFacturaCompra() {
		return cantidadFacturaCompra;
	}


	public void setCantidadFacturaCompra(int cantidadFacturaCompra) {
		this.cantidadFacturaCompra = cantidadFacturaCompra;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidadFacturaCompra;
		long temp;
		temp = Double.doubleToLongBits(precioUnitario);
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
		FacturaCompra other = (FacturaCompra) obj;
		if (cantidadFacturaCompra != other.cantidadFacturaCompra)
			return false;
		if (Double.doubleToLongBits(precioUnitario) != Double.doubleToLongBits(other.precioUnitario))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "FacturaCompra [cantidadFacturaCompra=" + cantidadFacturaCompra + ", precioUnitario=" + precioUnitario
				+ "]";
	}


	
	
	
	
}
