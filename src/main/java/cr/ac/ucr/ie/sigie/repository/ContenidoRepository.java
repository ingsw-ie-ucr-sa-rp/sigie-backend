package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Contenido;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IContenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContenidoRepository extends JpaRepository<Contenido, Integer> {
    List<IContenido> findAllBy();
}
