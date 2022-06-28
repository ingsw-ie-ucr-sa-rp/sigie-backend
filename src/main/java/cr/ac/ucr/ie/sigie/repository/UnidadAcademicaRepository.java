package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.UnidadAcademica;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IUnidadAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface UnidadAcademicaRepository extends JpaRepository<UnidadAcademica, Integer> {
    List<IUnidadAcademica> findAllBy();
}
