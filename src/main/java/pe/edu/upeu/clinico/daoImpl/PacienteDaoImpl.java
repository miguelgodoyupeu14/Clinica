package pe.edu.upeu.clinico.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clinico.dao.PacienteDao;
import pe.edu.upeu.clinico.entity.Paciente;
import pe.edu.upeu.clinico.repository.PacienteRepository;

@Component
public class PacienteDaoImpl implements PacienteDao {
	@Autowired
	private PacienteRepository pacienteRepository;
	@Override
	public Paciente create(Paciente p) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(p);
	}

	@Override
	public Paciente update(Paciente p) {
		// TODO Auto-generated method stub
		return pacienteRepository.save(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		pacienteRepository.deleteById(id);
	}

	@Override
	public Optional<Paciente> read(Long id) {
		// TODO Auto-generated method stub
		return pacienteRepository.findById(id);
	}

	@Override
	public List<Paciente> readAll() {
		// TODO Auto-generated method stub
		return pacienteRepository.findAll();
	}
}
