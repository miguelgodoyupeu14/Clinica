package pe.edu.upeu.clinico.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.clinico.dao.DiagnosticoDao;
import pe.edu.upeu.clinico.entity.Diagnostico;
import pe.edu.upeu.clinico.repository.DiagnosticoRepository;
@Component
public class DiagnosticoDaoImpl implements DiagnosticoDao{
	@Autowired
	private DiagnosticoRepository diagnosticoRepository;
	@Override
	public Diagnostico create(Diagnostico d) {
		// TODO Auto-generated method stub
		return diagnosticoRepository.save(d);
	}

	@Override
	public Diagnostico update(Diagnostico d) {
		// TODO Auto-generated method stub
		return diagnosticoRepository.save(d);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		diagnosticoRepository.deleteById(id);
	}

	@Override
	public Optional<Diagnostico> read(Long id) {
		// TODO Auto-generated method stub
		return diagnosticoRepository.findById(id);
	}

	@Override
	public List<Diagnostico> readAll() {
		// TODO Auto-generated method stub
		return diagnosticoRepository.findAll();
	}

}
