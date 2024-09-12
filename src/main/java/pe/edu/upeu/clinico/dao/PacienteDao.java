package pe.edu.upeu.clinico.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.clinico.entity.Paciente;



public interface PacienteDao {

	Paciente create(Paciente p);
	Paciente update(Paciente p);
	void delete(Long id);
	Optional<Paciente> read(Long id);
	List<Paciente> readAll();
}
