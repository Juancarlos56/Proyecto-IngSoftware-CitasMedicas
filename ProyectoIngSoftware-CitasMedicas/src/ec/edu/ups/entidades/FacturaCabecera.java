package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaCabecera
 *
 */
@Entity

public class FacturaCabecera extends FacturaGeneral<FacturaCabecera> implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "detallesDeFacturaCabecera")
    private List<FacturaDetalle> detallesDeFacturaCabecera=new ArrayList<FacturaDetalle>();
	
	
	public FacturaCabecera() {
		super();
	}
	
	
	
	public FacturaCabecera(GregorianCalendar fecha, String descripcion, String tipoTransaccion,
			char estado, double subtotal, double iva, double total, String tipoFactura) {
		
		super(fecha, descripcion, tipoTransaccion, estado, subtotal, iva, total, tipoFactura);
	
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
	public boolean actualizarCajaDiaria(FacturaCabecera factura, CajaDiaria cajaDiaria) {
		// TODO Auto-generated method stub
		return false;
	}



	public List<FacturaDetalle> getDetallesDeFacturaCabecera() {
		return detallesDeFacturaCabecera;
	}



	public void setDetallesDeFacturaCabecera(List<FacturaDetalle> detallesDeFacturaCabecera) {
		this.detallesDeFacturaCabecera = detallesDeFacturaCabecera;
	}
   
	public void addDetalleDeFacturaCabecera(FacturaDetalle detalleDeFacturaCabecera) {
		this.detallesDeFacturaCabecera.add(detalleDeFacturaCabecera);
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((detallesDeFacturaCabecera == null) ? 0 : detallesDeFacturaCabecera.hashCode());
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
		FacturaCabecera other = (FacturaCabecera) obj;
		if (detallesDeFacturaCabecera == null) {
			if (other.detallesDeFacturaCabecera != null)
				return false;
		} else if (!detallesDeFacturaCabecera.equals(other.detallesDeFacturaCabecera))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "FacturaCabecera [detallesDeFacturaCabecera=" + detallesDeFacturaCabecera + "]";
	}
	
	
}
