package pe.edu.upeu.clinico.dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.clinico.entity.Consulta;


public interface ConsultaDao {

	Consulta create(Consulta c);
	Consulta update(Consulta c);
	void delete(Long id);
	Optional<Consulta> read(Long id);
	List<Consulta> readAll();
}
