package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.BloqueElectivos;
import cr.ac.ucr.ie.sigie.entity.Contenido;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IBloqueElectivos;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IContenido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BloqueElectivosRepository extends JpaRepository<BloqueElectivos, Integer> {
    List<IBloqueElectivos> findAllBy();
}
