package ec.edu.ups.CargaBaseDatos;

import java.util.Calendar;

import ec.edu.ups.DAO.DAOFactory;
import ec.edu.ups.DAO.MedicoDAO;
import ec.edu.ups.entidades.Medico;

public class CreacionTablas {

	public static void main(String[] args) {
		
		Calendar fecha = Calendar.getInstance();
		fecha.set(1965,1,7);
		//Creacion de Medicos para test
		MedicoDAO medicoInterface = DAOFactory.getFactory().getMedicoDAO();
		Medico medico = new Medico("0106113302", "Homero", "Sarmiento", "Paute", fecha, "Ecuatoriana", "Masculino", "homeroSarmiento@gmail.com", "Medico", "Activo", "homeroSarmiento", "1234", "colocarURL");
		System.out.println(medico.toString());
		//medicoInterface.create(medico);
	
	}
}
