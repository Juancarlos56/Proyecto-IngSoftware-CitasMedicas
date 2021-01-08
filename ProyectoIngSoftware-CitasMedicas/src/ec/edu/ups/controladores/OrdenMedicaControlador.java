package ec.edu.ups.controladores;

import java.util.Date;

import ec.edu.ups.entidades.OrdenMedica;
import ec.edu.ups.entidades.Paciente;

public class OrdenMedicaControlador {
	public void nuevaOrdenMedica(String descripcion, String diagnostico, Date fechaOrdenMedica,	Paciente ordenesMedicasDeUnaConsulta) {
		OrdenMedica orden = new OrdenMedica(descripcion, diagnostico, fechaOrdenMedica, ordenesMedicasDeUnaConsulta);
	}
}
