package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.GregorianCalendar;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CajaDiaria
 *
 */
@Entity

public class CajaDiaria implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "caj_id")
    private int codigoCajaDiaria;
	
	@Column(name = "caj_dineroSalario")
    private int totalDineroSalarioCajaDiaria;
	
	
	@Column(name = "caj_dineroActivo")
    private int totalDineroActivoCajaDiaria;
	
	@Column(name = "caj_dineroDeuda")
    private int totalDineroDeudaCajaDiaria;
	
	@Column(name = "caj_dineroPatrimonio")
    private int totalDineroPatrimonioCajaDiaria;
	
	@Column(name = "caj_fecha")
	private GregorianCalendar fechaCajaDiaria;
	
	/*Relacion de mucho a uno con la entidad LibroDiario, atributo registroCajasDiarias */
    @ManyToOne
	@JoinColumn
	private LibroDario registroCajasDiarias;    
    
	public CajaDiaria() {
		super();
	}

	
	
	public CajaDiaria(int totalDineroSalarioCajaDiaria, int totalDineroActivoCajaDiaria, int totalDineroDeudaCajaDiaria,
			int totalDineroPatrimonioCajaDiaria, GregorianCalendar fechaCajaDiaria, LibroDario registroCajasDiarias) {
		super();
		this.totalDineroSalarioCajaDiaria = totalDineroSalarioCajaDiaria;
		this.totalDineroActivoCajaDiaria = totalDineroActivoCajaDiaria;
		this.totalDineroDeudaCajaDiaria = totalDineroDeudaCajaDiaria;
		this.totalDineroPatrimonioCajaDiaria = totalDineroPatrimonioCajaDiaria;
		this.fechaCajaDiaria = fechaCajaDiaria;
		this.registroCajasDiarias = registroCajasDiarias;
	}



	/**
	 * Metodos propios de la clase CajaDiaria
	 */
	
	public double calcularEntradas() {
		return 0.0;
	}
	
	public double calcularSalidas() {
		return 0.0;
	}
	
	public double calcularTotalDineroSalario() {
		return 0.0;
	}
	
	public double calcularTotalDineroActivo() {
		return 0.0;
	}
	
	public double calcularTotalDineroDeuda() {
		return 0.0;
	}
	
	public double calcularTotalPatrimonio() {
		return 0.0;
	}
	
	public double calcularResumenFacturas() {
		return 0.0;
	}
	
	
	/**
	 * Metodos Getters and Setters
	 */
	
	public int getCodigoCajaDiaria() {
		return codigoCajaDiaria;
	}



	public void setCodigoCajaDiaria(int codigoCajaDiaria) {
		this.codigoCajaDiaria = codigoCajaDiaria;
	}



	public int getTotalDineroSalarioCajaDiaria() {
		return totalDineroSalarioCajaDiaria;
	}



	public void setTotalDineroSalarioCajaDiaria(int totalDineroSalarioCajaDiaria) {
		this.totalDineroSalarioCajaDiaria = totalDineroSalarioCajaDiaria;
	}



	public int getTotalDineroActivoCajaDiaria() {
		return totalDineroActivoCajaDiaria;
	}



	public void setTotalDineroActivoCajaDiaria(int totalDineroActivoCajaDiaria) {
		this.totalDineroActivoCajaDiaria = totalDineroActivoCajaDiaria;
	}



	public int getTotalDineroDeudaCajaDiaria() {
		return totalDineroDeudaCajaDiaria;
	}



	public void setTotalDineroDeudaCajaDiaria(int totalDineroDeudaCajaDiaria) {
		this.totalDineroDeudaCajaDiaria = totalDineroDeudaCajaDiaria;
	}



	public int getTotalDineroPatrimonioCajaDiaria() {
		return totalDineroPatrimonioCajaDiaria;
	}



	public void setTotalDineroPatrimonioCajaDiaria(int totalDineroPatrimonioCajaDiaria) {
		this.totalDineroPatrimonioCajaDiaria = totalDineroPatrimonioCajaDiaria;
	}



	public GregorianCalendar getFechaCajaDiaria() {
		return fechaCajaDiaria;
	}



	public void setFechaCajaDiaria(GregorianCalendar fechaCajaDiaria) {
		this.fechaCajaDiaria = fechaCajaDiaria;
	}



	public LibroDario getRegistroCajasDiarias() {
		return registroCajasDiarias;
	}



	public void setRegistroCajasDiarias(LibroDario registroCajasDiarias) {
		this.registroCajasDiarias = registroCajasDiarias;
	}

	/**
	 * Metodos Hashcode and equals
	 */


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codigoCajaDiaria;
		result = prime * result + ((fechaCajaDiaria == null) ? 0 : fechaCajaDiaria.hashCode());
		result = prime * result + totalDineroActivoCajaDiaria;
		result = prime * result + totalDineroDeudaCajaDiaria;
		result = prime * result + totalDineroPatrimonioCajaDiaria;
		result = prime * result + totalDineroSalarioCajaDiaria;
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
		CajaDiaria other = (CajaDiaria) obj;
		if (codigoCajaDiaria != other.codigoCajaDiaria)
			return false;
		if (fechaCajaDiaria == null) {
			if (other.fechaCajaDiaria != null)
				return false;
		} else if (!fechaCajaDiaria.equals(other.fechaCajaDiaria))
			return false;
		if (totalDineroActivoCajaDiaria != other.totalDineroActivoCajaDiaria)
			return false;
		if (totalDineroDeudaCajaDiaria != other.totalDineroDeudaCajaDiaria)
			return false;
		if (totalDineroPatrimonioCajaDiaria != other.totalDineroPatrimonioCajaDiaria)
			return false;
		if (totalDineroSalarioCajaDiaria != other.totalDineroSalarioCajaDiaria)
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "CajaDiaria [codigoCajaDiaria=" + codigoCajaDiaria + ", totalDineroSalarioCajaDiaria="
				+ totalDineroSalarioCajaDiaria + ", totalDineroActivoCajaDiaria=" + totalDineroActivoCajaDiaria
				+ ", totalDineroDeudaCajaDiaria=" + totalDineroDeudaCajaDiaria + ", totalDineroPatrimonioCajaDiaria="
				+ totalDineroPatrimonioCajaDiaria + ", fechaCajaDiaria=" + fechaCajaDiaria + "]";
	}
	
	
	/**
	 * Metodo ToString devuelve una cadena con los atributos de la clase
	 */
	

	
}
