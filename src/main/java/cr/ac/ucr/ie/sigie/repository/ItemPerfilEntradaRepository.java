package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemPerfilEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemPerfilEntradaRepository extends JpaRepository<ItemPerfilEntrada, Integer> {
    List<IItemPerfilEntrada> findAllBy();
}
