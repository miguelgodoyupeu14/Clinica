package pe.edu.upeu.clinico.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upeu.clinico.entity.Diagnostico;


@Repository
public interface DiagnosticoRepository extends JpaRepository<Diagnostico, Long>{

}
