package ec.edu.ups.controladores;

import java.util.GregorianCalendar;

import ec.edu.ups.entidades.CajaDiaria;
import ec.edu.ups.entidades.LibroDiario;
import ec.edu.ups.entidades.Secretaria;

public class LibroDiarioControlador {

	public void nuevoLibro(Secretaria secretaria,CajaDiaria caja) {
		LibroDiario nuevoLibro=new LibroDiario(0, new GregorianCalendar(), caja, secretaria);
	}
	public float calcularTotal(LibroDiario libro) {
		return (float) (libro.getLibroDiarioDeCajaDiaria().calcularTotalDineroActivo()-libro.getLibroDiarioDeCajaDiaria().calcularTotalDineroDeuda());
	}
}
