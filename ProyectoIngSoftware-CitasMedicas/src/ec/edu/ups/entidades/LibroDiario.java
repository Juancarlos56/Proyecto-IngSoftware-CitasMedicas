package ec.edu.ups.entidades;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: LibroDiario
 *
 */
@Entity

public class LibroDiario implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "libroId")
	private int id;
	
	@Column(name = "totalLibroDiario")
	private float total;	
	
	@Column(name = "fechaLibroDiario")
	private GregorianCalendar fecha;
	
	@ManyToOne
	@JoinColumn(name = "FK_libroDiario_CajaDiaria")
	private CajaDiaria libroDiarioDeCajaDiaria;    
    
	
	@ManyToOne
	@JoinColumn(name = "FK_libroDiario_Secretaria")
	private Secretaria responsable;
	
	public LibroDiario() {
		super();
	}

	

	public LibroDiario(int id, float total, GregorianCalendar fecha, CajaDiaria libroDiarioDeCajaDiaria,
			Secretaria responsable) {
		super();
		this.id = id;
		this.total = total;
		this.fecha = fecha;
		this.libroDiarioDeCajaDiaria = libroDiarioDeCajaDiaria;
		this.responsable = responsable;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public GregorianCalendar getFecha() {
		return fecha;
	}

	public void setFecha(GregorianCalendar fecha) {
		this.fecha = fecha;
	}



	public CajaDiaria getLibroDiarioDeCajaDiaria() {
		return libroDiarioDeCajaDiaria;
	}



	public void setLibroDiarioDeCajaDiaria(CajaDiaria libroDiarioDeCajaDiaria) {
		this.libroDiarioDeCajaDiaria = libroDiarioDeCajaDiaria;
	}



	public Secretaria getResponsable() {
		return responsable;
	}



	public void setResponsable(Secretaria responsable) {
		this.responsable = responsable;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fecha == null) ? 0 : fecha.hashCode());
		result = prime * result + id;
		result = prime * result + ((libroDiarioDeCajaDiaria == null) ? 0 : libroDiarioDeCajaDiaria.hashCode());
		result = prime * result + Float.floatToIntBits(total);
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
		LibroDiario other = (LibroDiario) obj;
		if (fecha == null) {
			if (other.fecha != null)
				return false;
		} else if (!fecha.equals(other.fecha))
			return false;
		if (id != other.id)
			return false;
		if (libroDiarioDeCajaDiaria == null) {
			if (other.libroDiarioDeCajaDiaria != null)
				return false;
		} else if (!libroDiarioDeCajaDiaria.equals(other.libroDiarioDeCajaDiaria))
			return false;
		if (Float.floatToIntBits(total) != Float.floatToIntBits(other.total))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "LibroDiario [id=" + id + ", total=" + total + ", fecha=" + fecha + ", libroDiarioDeCajaDiaria="
				+ libroDiarioDeCajaDiaria + "]";
	}

	
   
}
