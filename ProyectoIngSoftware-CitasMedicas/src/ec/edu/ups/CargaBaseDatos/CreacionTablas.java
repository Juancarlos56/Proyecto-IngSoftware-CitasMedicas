package ec.edu.ups.CargaBaseDatos;

import java.util.Calendar;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.EspecialidadDAO;
import ec.edu.ups.DAO.MedicoDAO;
import ec.edu.ups.DAO.OrdenMedicaDAO;
import ec.edu.ups.DAO.PersonaDAO;
import ec.edu.ups.entidades.Especialidad;
import ec.edu.ups.entidades.Medico;
import ec.edu.ups.entidades.OrdenMedica;
import ec.edu.ups.entidades.Persona;

public class CreacionTablas {

	public static void main(String[] args) {
		
		Calendar fecha2 = Calendar.getInstance();
		fecha2.set(1965,1,7);
		//Persona p = new Persona("0106113302", "Homero", "Sarmiento", "Paute", fecha2, "Ecuatoriana", "Masculino", "homeroSarmiento@gmail.com", "Medico", "Activo");
		//PersonaDAO personaInterface = DAOFactory.getFactory().getPersonaDAO();		
		//personaInterface.create(p);
		
		
		MedicoDAO medicoInterface = DAOFactory.getFactory().getMedicoDAO();
		Medico medico = new Medico("0106113302", "Homero", "Sarmiento", "Paute", fecha2, "Ecuatoriana", "Masculino", "homeroSarmiento@gmail.com", "Medico", "Activo", "homeroSarmiento", "1234", "colocarURL");
		System.out.println(medico.toString());
		medicoInterface.create(medico);
	}
}
