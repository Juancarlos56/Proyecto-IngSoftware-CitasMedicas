package ec.edu.ups.controladores;

import java.util.Calendar;

import ec.edu.ups.entidades.CajaDiaria;

public class CajaDiariaControlador {
	public void cajaControlador(int totalDineroSalarioCajaDiaria, int totalDineroActivoCajaDiaria, int totalDineroDeudaCajaDiaria,
			int totalDineroPatrimonioCajaDiaria, Calendar fechaCajaDiaria) {
		CajaDiaria caja = new CajaDiaria(totalDineroSalarioCajaDiaria, totalDineroActivoCajaDiaria, totalDineroDeudaCajaDiaria, totalDineroPatrimonioCajaDiaria, fechaCajaDiaria);
	}
	public double calculartotalEntrada(CajaDiaria caja) {
		return caja.calcularTotalEntradas();		
	}
}
