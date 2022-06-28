package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IPlanEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PlanEstudioRepository extends JpaRepository<PlanEstudio, Integer> {
    List<IPlanEstudio> findAllBy();
}
