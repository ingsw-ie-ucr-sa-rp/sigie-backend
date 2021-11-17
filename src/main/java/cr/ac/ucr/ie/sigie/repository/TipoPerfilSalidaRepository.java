package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.TipoPerfilSalida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoPerfilSalidaRepository extends JpaRepository<TipoPerfilSalida, Integer> {
}
