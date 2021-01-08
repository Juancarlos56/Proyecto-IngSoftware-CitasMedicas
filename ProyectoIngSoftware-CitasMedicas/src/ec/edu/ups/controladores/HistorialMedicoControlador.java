package ec.edu.ups.controladores;

import java.util.GregorianCalendar;

import ec.edu.ups.entidades.HistorialMedico;
import ec.edu.ups.entidades.Paciente;

public class HistorialMedicoControlador {
	public void nuevoHistorial(String anamnesis, String examenFisicoDeUnPaciente, String examenSemiologicoDeUnPaciente,
			String diagnosticoPresuntivoDeUnPaciente, String metodosComplementariosDeUnPaciente,
			String evolucionDiariaDeUnPaciente, String epicrisisDeUnPaciente, GregorianCalendar fechaHistoriaMedica,
			String medicacionActualDeUnPaciente, String enfermedadesActualesDeUnPaciente, float pesoDeUnPaciente,
			float iMCDeUnPaciente, Paciente historialDelPaciente) {
		HistorialMedico historial= new HistorialMedico(anamnesis, examenFisicoDeUnPaciente, examenSemiologicoDeUnPaciente, diagnosticoPresuntivoDeUnPaciente, metodosComplementariosDeUnPaciente, evolucionDiariaDeUnPaciente, epicrisisDeUnPaciente, fechaHistoriaMedica, medicacionActualDeUnPaciente, enfermedadesActualesDeUnPaciente, pesoDeUnPaciente, iMCDeUnPaciente, historialDelPaciente);
	}
}
