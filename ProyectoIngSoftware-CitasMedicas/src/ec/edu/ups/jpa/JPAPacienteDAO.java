package ec.edu.ups.jpa;

import ec.edu.ups.DAO.PacienteDAO;
import ec.edu.ups.entidades.Paciente;

public class JPAPacienteDAO extends JPAGenericDAO<Paciente, Integer> implements PacienteDAO{

	public JPAPacienteDAO() {
		super(Paciente.class);
		// TODO Auto-generated constructor stub
	}

}
