package pe.edu.upeu.clinico.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.clinico.dao.MedicoDao;
import pe.edu.upeu.clinico.entity.Medico;
import pe.edu.upeu.clinico.service.MedicoService;
@Service
public class MedicoServiceImpl implements MedicoService {
	@Autowired
	private MedicoDao medicoDao;
	@Override
	public Medico create(Medico m) {
		// TODO Auto-generated method stub
		return medicoDao.create(m);
	}

	@Override
	public Medico update(Medico m) {
		// TODO Auto-generated method stub
		return medicoDao.update(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		medicoDao.delete(id);
	}

	@Override
	public Optional<Medico> read(Long id) {
		// TODO Auto-generated method stub
		return medicoDao.read(id);
	}

	@Override
	public List<Medico> readAll() {
		// TODO Auto-generated method stub
		return medicoDao.readAll();
	}

}
