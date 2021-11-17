package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ItemDescripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDescripcionRepository extends JpaRepository<ItemDescripcion, Integer> {
}
