package pe.edu.upeu.clinico.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clinico.dao.PacienteDao;
import pe.edu.upeu.clinico.entity.Paciente;
import pe.edu.upeu.clinico.service.PacienteService;
@Service
public class PacienteServiceImpl implements PacienteService{
	@Autowired
	private PacienteDao pacienteDao;
	@Override
	public Paciente create(Paciente p) {
		// TODO Auto-generated method stub
		return pacienteDao.create(p);
	}

	@Override
	public Paciente update(Paciente p) {
		// TODO Auto-generated method stub
		return pacienteDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pacienteDao.delete(id);
	}

	@Override
	public Optional<Paciente> read(Long id) {
		// TODO Auto-generated method stub
		return pacienteDao.read(id);
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return pacienteDao.readAll();
	}

}
