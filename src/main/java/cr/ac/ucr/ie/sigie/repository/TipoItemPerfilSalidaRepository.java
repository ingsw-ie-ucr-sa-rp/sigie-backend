package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilSalida;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilSalida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoItemPerfilSalidaRepository extends JpaRepository<TipoItemPerfilSalida, Integer> {
    List<ITipoItemPerfilSalida> findAllBy();
}
