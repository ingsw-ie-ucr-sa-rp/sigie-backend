package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ResultadosAprendizaje;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IResultadoAprendizaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultadosAprendizajeRepository extends JpaRepository<ResultadosAprendizaje, Integer> {
    List<IResultadoAprendizaje> findAllBy();
}
