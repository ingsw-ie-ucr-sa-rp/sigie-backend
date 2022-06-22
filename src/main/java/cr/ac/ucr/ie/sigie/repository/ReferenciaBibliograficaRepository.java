package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ReferenciaBibliografica;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IReferenciaBibliografica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ReferenciaBibliograficaRepository extends JpaRepository<ReferenciaBibliografica, Integer> {
    List<IReferenciaBibliografica> findAllBy();
}
