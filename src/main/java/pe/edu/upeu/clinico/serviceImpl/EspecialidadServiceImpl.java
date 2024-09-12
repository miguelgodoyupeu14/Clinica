package pe.edu.upeu.clinico.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clinico.dao.EspecialidadDao;
import pe.edu.upeu.clinico.entity.Especialidad;
import pe.edu.upeu.clinico.service.EspecialidadService;
@Service
public class EspecialidadServiceImpl implements EspecialidadService{
	@Autowired
	private EspecialidadDao especialidadDao;
	@Override
	public Especialidad create(Especialidad e) {
		// TODO Auto-generated method stub
		return especialidadDao.create(e);
	}

	@Override
	public Especialidad update(Especialidad e) {
		// TODO Auto-generated method stub
		return especialidadDao.update(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		especialidadDao.delete(id);
	}

	@Override
	public Optional<Especialidad> read(Long id) {
		// TODO Auto-generated method stub
		return especialidadDao.read(id);
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return especialidadDao.readAll();
	}

}
