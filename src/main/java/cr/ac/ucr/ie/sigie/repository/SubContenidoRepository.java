package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.SubContenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubContenidoRepository extends JpaRepository<SubContenido, Integer> {
}
