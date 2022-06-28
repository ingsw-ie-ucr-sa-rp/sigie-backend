package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.CursoElectivo;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICurso;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICursoElectivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoElectivoRepository extends JpaRepository<CursoElectivo, Integer> {
    List<ICursoElectivo> findAllBy();
}
