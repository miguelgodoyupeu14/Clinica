package pe.edu.upeu.clinico.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clinico.dao.MedicoDao;
import pe.edu.upeu.clinico.entity.Medico;
import pe.edu.upeu.clinico.repository.MedicoRepository;

@Component
public class MedicoDaoImpl implements MedicoDao {
	@Autowired
	private MedicoRepository medicoRepository;
	@Override
	public Medico create(Medico m) {
		// TODO Auto-generated method stub
		return medicoRepository.save(m);
	}

	@Override
	public Medico update(Medico m) {
		// TODO Auto-generated method stub
		return medicoRepository.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicoRepository.deleteById(id);
	}

	@Override
	public Optional<Medico> read(Long id) {
		// TODO Auto-generated method stub
		return medicoRepository.findById(id);
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return medicoRepository.findAll();
	}
}
