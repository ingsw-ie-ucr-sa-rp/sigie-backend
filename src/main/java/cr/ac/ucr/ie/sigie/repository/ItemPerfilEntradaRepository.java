package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPerfilEntradaRepository extends JpaRepository<ItemPerfilEntrada, Integer> {
}
