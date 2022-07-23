package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IAreaDisciplinaria;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IUnidadAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface AreaDisciplinariaRepository extends JpaRepository<AreaDisciplinaria, Integer> {
    List<IAreaDisciplinaria> findAllBy();
    List<IAreaDisciplinaria> findAllByNombreContains(String nombre);
}
