package pe.edu.upeu.clinico.service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.clinico.entity.Especialidad;

public interface EspecialidadService {
	Especialidad create(Especialidad e);
	Especialidad update(Especialidad e);
	void delete(Long id);
	Optional<Especialidad> read(Long id);
	List<Especialidad> readAll();
}
