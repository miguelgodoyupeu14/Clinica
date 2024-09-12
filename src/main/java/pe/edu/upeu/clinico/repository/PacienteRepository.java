package pe.edu.upeu.clinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.clinico.entity.Paciente;


@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long>{

}