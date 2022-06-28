package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ItemDescripcion;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemDescripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ItemDescripcionRepository extends JpaRepository<ItemDescripcion, Integer> {
    List<IItemDescripcion> findAllBy();
}
