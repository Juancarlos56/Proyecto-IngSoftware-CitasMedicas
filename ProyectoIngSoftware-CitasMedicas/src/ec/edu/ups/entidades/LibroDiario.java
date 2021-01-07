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
<<<<<<< HEAD
	private int id;
	private float total;	
	private GregorianCalendar fecha;
	private Secretaria responsableLibroDiario;
=======
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "libroId")
	private int libroId;
	
	@Column(name = "totalLibroDiario")
	private float totalLibroDiario;	
	
	@Column(name = "fechaLibroDiario")
	private GregorianCalendar fechaLibroDiario;
	
	@ManyToOne
	@JoinColumn(name = "FK_libroDiario_CajaDiaria")
	private CajaDiaria libroDiarioDeCajaDiaria;    
    
	
	@ManyToOne
	@JoinColumn(name = "FK_libroDiario_Secretaria")
	private Secretaria responsable;
>>>>>>> refs/heads/master
	
	public LibroDiario() {
		super();
	}

	public LibroDiario(int libroId, float totalLibroDiario, GregorianCalendar fechaLibroDiario,
			CajaDiaria libroDiarioDeCajaDiaria, Secretaria responsable) {
		super();
		this.libroId = libroId;
		this.totalLibroDiario = totalLibroDiario;
		this.fechaLibroDiario = fechaLibroDiario;
		this.libroDiarioDeCajaDiaria = libroDiarioDeCajaDiaria;
		this.responsable = responsable;
	}

	//Contructor sin codigo por autogeneracion
	public LibroDiario(float totalLibroDiario, GregorianCalendar fechaLibroDiario, CajaDiaria libroDiarioDeCajaDiaria,
			Secretaria responsable) {
		super();
		this.totalLibroDiario = totalLibroDiario;
		this.fechaLibroDiario = fechaLibroDiario;
		this.libroDiarioDeCajaDiaria = libroDiarioDeCajaDiaria;
		this.responsable = responsable;
	}

	public int getLibroId() {
		return libroId;
	}

	public void setLibroId(int libroId) {
		this.libroId = libroId;
	}

	public float getTotalLibroDiario() {
		return totalLibroDiario;
	}

	public void setTotalLibroDiario(float totalLibroDiario) {
		this.totalLibroDiario = totalLibroDiario;
	}

	public GregorianCalendar getFechaLibroDiario() {
		return fechaLibroDiario;
	}

	public void setFechaLibroDiario(GregorianCalendar fechaLibroDiario) {
		this.fechaLibroDiario = fechaLibroDiario;
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
		result = prime * result + ((fechaLibroDiario == null) ? 0 : fechaLibroDiario.hashCode());
		result = prime * result + ((libroDiarioDeCajaDiaria == null) ? 0 : libroDiarioDeCajaDiaria.hashCode());
		result = prime * result + libroId;
		result = prime * result + Float.floatToIntBits(totalLibroDiario);
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
		if (fechaLibroDiario == null) {
			if (other.fechaLibroDiario != null)
				return false;
		} else if (!fechaLibroDiario.equals(other.fechaLibroDiario))
			return false;
		if (libroDiarioDeCajaDiaria == null) {
			if (other.libroDiarioDeCajaDiaria != null)
				return false;
		} else if (!libroDiarioDeCajaDiaria.equals(other.libroDiarioDeCajaDiaria))
			return false;
		if (libroId != other.libroId)
			return false;
		if (Float.floatToIntBits(totalLibroDiario) != Float.floatToIntBits(other.totalLibroDiario))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "LibroDiario [libroId=" + libroId + ", totalLibroDiario=" + totalLibroDiario + ", fechaLibroDiario="
				+ fechaLibroDiario + ", libroDiarioDeCajaDiaria=" + libroDiarioDeCajaDiaria + "]";
	}


}
