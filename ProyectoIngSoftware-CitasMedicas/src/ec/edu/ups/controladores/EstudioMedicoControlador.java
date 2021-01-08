package ec.edu.ups.controladores;

import java.util.Calendar;

import ec.edu.ups.entidades.Especialidad;
import ec.edu.ups.entidades.EstudioMedico;
import ec.edu.ups.entidades.Medico;

public class EstudioMedicoControlador {
	public void nuevoEstudio(Calendar fechaTituloMedico, Medico estudioRealizadoPorMedico,
			Especialidad especialidadDeEstudio) {
		EstudioMedico estudio = new EstudioMedico(fechaTituloMedico, estudioRealizadoPorMedico, especialidadDeEstudio);
	}
}
