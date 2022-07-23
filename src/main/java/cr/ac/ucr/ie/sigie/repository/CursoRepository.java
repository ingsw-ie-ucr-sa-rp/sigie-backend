package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
    List<ICurso> findAllBy();
    List<ICurso> findAllByNombreContainsAndPadreTrue(String nombre);
    List<ICurso> findAllByNombreContains(String nombre);
}
