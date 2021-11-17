package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Modalidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModalidadRepository extends JpaRepository<Modalidad, Integer> {
}
