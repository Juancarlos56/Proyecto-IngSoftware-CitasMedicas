package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public abstract class FacturaGeneral<T> implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	/*
	 * Atributos privados de la clase
	 * */
	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "idFactura")
	private int idFactura;
	
	@Column(name="fechaFactura",nullable=false)
	private GregorianCalendar fecha;
	
	
	@Column(name="descripcionFactura", length=255)
	private String descripcion;
	
	@Column(name="tipoTransaccionFactura", length=20, nullable=false)
	private String tipoTransaccion;
	
	@Column(name="estadoFactura", length=20, nullable=false)
	private char estado;
	
	@Column(name = "subtotalFactura")
	private double subtotal;
	
	@Column(name = "ivaFactura")
	private double iva;
	
	@Column(name = "totalFactura")
	private double total;
	
	@Column(name="tipoFacturaFactura", length=20, nullable=false)
	private String  tipoFactura;
	
	public FacturaGeneral() {
		super();
	}
	
	
	/**
	 * Metodo constructor de la clase FacturaGeneral
	 * @param idFactura
	 * @param fecha
	 * @param descripcion
	 * @param tipoTransaccion
	 * @param estado
	 * @param subtotal
	 * @param iva
	 * @param total
	 * @param tipoFactura
	 */
	public FacturaGeneral(GregorianCalendar fecha, String descripcion, String tipoTransaccion,
			char estado, double subtotal, double iva, double total, String tipoFactura) {
		super();
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.tipoTransaccion = tipoTransaccion;
		this.estado = estado;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.tipoFactura = tipoFactura;
	}

	
	

	public FacturaGeneral(int idFactura, GregorianCalendar fecha, String descripcion, String tipoTransaccion,
			char estado, double subtotal, double iva, double total, String tipoFactura) {
		super();
		this.idFactura = idFactura;
		this.fecha = fecha;
		this.descripcion = descripcion;
		this.tipoTransaccion = tipoTransaccion;
		this.estado = estado;
		this.subtotal = subtotal;
		this.iva = iva;
		this.total = total;
		this.tipoFactura = tipoFactura;
	}


	/**
	 * Metodo para calcular el subtotal de una factura
	 * @return
	 */
	public double calcularSubtotal() {
		return 0.0;
	}
	
	/**
	 * Metodo para calcular el total de una factura 
	 * @param subtotal
	 * @param iva
	 * @return
	 */
	public double calcularTotalFactura() {
		return 0.0;
	}
	
	/**
	 * 
	 * @return
	 */
	public double calcularValorFactura() {
		return 0.0;
	}
	
	
	/**
	 * Metodo para la actulizacion de la caja cada vez que se hace una transaccion sera
	 * implementado en cada clase factura
	 * @param <T>
	 * @param factura
	 * @param cajaDiaria
	 * @return
	 */
	public abstract boolean actualizarCajaDiaria(T factura, CajaDiaria cajaDiaria);



	/*
	 * Metodos Getters and Setters de atributos privados 
	 * */
	
	public int getIdFactura() {
		return idFactura;
	}



	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}



	public GregorianCalendar getFecha() {
		return fecha;
	}



	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public String getTipoTransaccion() {
		return tipoTransaccion;
	}



	public void setTipoTransaccion(String tipoTransaccion) {
		this.tipoTransaccion = tipoTransaccion;
	}



	public char getEstado() {
		return estado;
	}



	public void setEstado(char estado) {
		this.estado = estado;
	}



	public double getSubtotal() {
		return subtotal;
	}



	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}



	public double getIva() {
		return iva;
	}



	public void setIva(double iva) {
		this.iva = iva;
	}



	public double getTotal() {
		return total;
	}



	public void setTotal(double total) {
		this.total = total;
	}



	public String getTipoFactura() {
		return tipoFactura;
	}



	public void setTipoFactura(String tipoFactura) {
		this.tipoFactura = tipoFactura;
	}

	
	@Override
	public String toString() {
		return "FacturaGeneral [idFactura=" + idFactura + ", fecha=" + fecha + ", descripcion=" + descripcion
				+ ", tipoTransaccion=" + tipoTransaccion + ", estado=" + estado + ", Subtotal=" + subtotal + ", iva="
				+ iva + ", total=" + total + ", tipoFactura=" + tipoFactura + "]";
	} 
	
	
	
	
}
