package pe.edu.upeu.clinico.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.clinico.entity.Consulta;

public interface ConsultaService {

	Consulta create(Consulta c);
	Consulta update(Consulta c);
	void delete(Long id);
	Optional<Consulta> read(Long id);
	List<Consulta> readAll();
}
