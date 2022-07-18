package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilSalida;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemPerfilSalida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPerfilSalidaRepository extends JpaRepository<ItemPerfilSalida, Integer> {
    List<IItemPerfilSalida> findAllBy();
}
