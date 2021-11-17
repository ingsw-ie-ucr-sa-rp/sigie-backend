package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Contenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContenidoRepository extends JpaRepository<Contenido, Integer> {
}
