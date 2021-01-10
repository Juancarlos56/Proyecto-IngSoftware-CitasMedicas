package ec.edu.ups.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;
import java.util.Calendar;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import ec.edu.ups.entidades.CajaDiaria;
import ec.edu.ups.controladores.CajaDiariaControlador;

class CajaDiariaTest {
	
	private String respuesta="";
	
	private CajaDiariaControlador cajaDiaria = new CajaDiariaControlador();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		Calendar fecha = Calendar.getInstance();
		cajaDiaria.cajaControlador(500, 200, 50, 100,fecha);		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		assertEquals("Ingresado", respuesta);
	}
	


}
