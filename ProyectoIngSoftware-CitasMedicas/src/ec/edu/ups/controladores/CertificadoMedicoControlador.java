package ec.edu.ups.controladores;

import java.util.Date;

import ec.edu.ups.entidades.Certificado;
import ec.edu.ups.entidades.Consulta;

public class CertificadoMedicoControlador {
	public void nuevoCertificadoMedico(Date fechaEnvioDeCerficado, int numeroDiasDeReposoParaPaciente,
			String descripcionParaCertificado, Consulta certificadoDeUnaConsulta) {
		Certificado certificado= new Certificado(fechaEnvioDeCerficado, numeroDiasDeReposoParaPaciente, descripcionParaCertificado, certificadoDeUnaConsulta);
	}
}
