package ec.edu.ups.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ec.edu.ups.entidades.FacturaCabecera;

class FacturaCabeceraTest {

	
	private FacturaCabecera factura;
	
	@BeforeEach
	void setUp() throws Exception {
		factura = new FacturaCabecera(); 
		
		Calendar fecha = Calendar.getInstance();
		String descripcion = "Cobro de factura";
		String tipoTransaccion = "Activo";
		String estado = "PagarMedico";
		double iva = 12.0;
		double subtotal = 50;
		//facturas.calcularSubtotal();
		double total = factura.calcularTotalFactura();
		String tipoFactura = "facturaCabecera";
		
		
		factura.setFecha(fecha);
		factura.setDescripcion(descripcion);
		factura.setTipoTransaccion(tipoTransaccion);
		factura.setEstado(estado);
		factura.setIva(iva);
		factura.setSubtotal(subtotal);
		factura.setTotal(total);
		factura.setTipoFactura(tipoFactura);
		
		factura = new FacturaCabecera(idFactura, fecha, descripcion, 
				tipoTransaccion, estado, subtotal, iva, total, 
				tipoFactura, activoCobroCitaMedica, 
				cabeceraPagoSalario, medico)
		
	}
	
	@Test
	@Tag("Salarios")
	void calculaSalarioHorasExtras() {
		
	}
	
	@Test
	void test() {
		fail("Not yet implemented");
	}

}
