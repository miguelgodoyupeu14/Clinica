package pe.edu.upeu.clinico.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clinico.dao.EspecialidadDao;
import pe.edu.upeu.clinico.entity.Especialidad;
import pe.edu.upeu.clinico.repository.EspecialidadRepository;
@Component
public class EspecialidadDaoImpl implements EspecialidadDao {
	@Autowired
	private EspecialidadRepository especialidadRepository;
	@Override
	public Especialidad create(Especialidad e) {
		// TODO Auto-generated method stub
		return especialidadRepository.save(e);
	}

	@Override
	public Especialidad update(Especialidad e) {
		// TODO Auto-generated method stub
		return especialidadRepository.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		especialidadRepository.deleteById(id);
	}

	@Override
	public Optional<Especialidad> read(Long id) {
		// TODO Auto-generated method stub
		return especialidadRepository.findById(id);
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return especialidadRepository.findAll();
	}

}
