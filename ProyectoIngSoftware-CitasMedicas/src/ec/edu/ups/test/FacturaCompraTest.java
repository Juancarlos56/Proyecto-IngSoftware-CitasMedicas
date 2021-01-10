package ec.edu.ups.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ec.edu.ups.entidades.Activo;
import ec.edu.ups.entidades.FacturaCompra;
import ec.edu.ups.entidades.Activo;

import java.util.Calendar;

class FacturaCompraTest {
	
	private FacturaCompra facturaCompra;

	@BeforeEach
	void setUp() throws Exception {
		this.facturaCompra = new FacturaCompra(Calendar.getInstance(), "Compra de gasas y utencilios", "Pagado", "Activo", 12.20, 12.00, 13.66, "Cliente", 2, 6.10
				,new Activo());
	}

	@Test
	void calcularSubtotaltest() {
		double respuesta = this.facturaCompra.calcularSubtotal();
		assertEquals(12.20, respuesta);
	}
	
	@Test
	void calcularTotaltest() {
		double respuesta = this.facturaCompra.calcularTotalFactura();
		assertEquals(13.66, respuesta);
		
	}
	

}
