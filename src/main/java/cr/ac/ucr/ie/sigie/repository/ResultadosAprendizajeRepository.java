package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ResultadosAprendizaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultadosAprendizajeRepository extends JpaRepository<ResultadosAprendizaje, Integer> {
}
