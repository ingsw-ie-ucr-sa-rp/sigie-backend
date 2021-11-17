package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.UnidadAcademica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadAcademicaRepository extends JpaRepository<UnidadAcademica, Integer> {
}
