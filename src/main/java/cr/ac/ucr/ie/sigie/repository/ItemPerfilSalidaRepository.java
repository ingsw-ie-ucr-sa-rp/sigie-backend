package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilSalida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPerfilSalidaRepository extends JpaRepository<ItemPerfilSalida, Integer> {
}
