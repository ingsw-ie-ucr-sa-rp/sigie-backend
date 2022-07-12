package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.TipoItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ITipoItemPerfilEntrada;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TipoItemPerfilEntradaRepository extends JpaRepository<TipoItemPerfilEntrada, Integer> {
    List<ITipoItemPerfilEntrada> findAllBy();
}
