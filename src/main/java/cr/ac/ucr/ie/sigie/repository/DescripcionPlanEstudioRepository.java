package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.DescripcionPlanEstudio;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IDescripcionPlanEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DescripcionPlanEstudioRepository extends JpaRepository <DescripcionPlanEstudio, Integer> {
    List<IDescripcionPlanEstudio> findAllBy();
}
