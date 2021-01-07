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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCertificado")
	private int idCertificado;
	
	@Column(name = "fechaEnvioDeCerficado")
	private Date fechaEnvioDeCerficado;
	
	@Column(name = "numeroDiasDeReposoParaPaciente")
	private int numeroDiasDeReposoParaPaciente;
	
	@Column(name = "descripcionParaCertificado")
	private String descripcionParaCertificado;
	
	@OneToOne
    @JoinColumn(name = "FK_Consulta_Certificado")
    private Consulta certificadoDeUnaConsulta;
	

	public int getIdCertificado() {
		return idCertificado;
	}



	public void setIdCertificado(int idCertificado) {
		this.idCertificado = idCertificado;
	}



   
}
