package ec.edu.ups.controladores;

import ec.edu.ups.entidades.Especialidad;

public class EspecialidadControlador {
	public void nuevaEspecialidad(String nombre) {
		Especialidad especialidad = new Especialidad(nombre);
	}
}
