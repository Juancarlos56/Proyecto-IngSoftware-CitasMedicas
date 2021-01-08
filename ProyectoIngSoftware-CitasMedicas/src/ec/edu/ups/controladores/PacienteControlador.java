package ec.edu.ups.controladores;

import java.util.GregorianCalendar;

import ec.edu.ups.entidades.Paciente;

public class PacienteControlador {
	public void nuevoPaciente(String tipo,String cedula,String nombre, String apellido, String lugarN, GregorianCalendar fechaN, String nacienalidad, String sexo, String email, String tipoUsuario,
			String estado, int idPaciente, String tipoSangre) {
		Paciente paciente = new Paciente(cedula, nombre, apellido, lugarN, fechaN, nacienalidad, sexo, email, tipoUsuario, estado, idPaciente, tipoSangre);
	}
}
