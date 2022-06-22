package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Modalidad;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IModalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ModalidadRepository extends JpaRepository<Modalidad, Integer> {
    List<IModalidad> findAllBy();
}
