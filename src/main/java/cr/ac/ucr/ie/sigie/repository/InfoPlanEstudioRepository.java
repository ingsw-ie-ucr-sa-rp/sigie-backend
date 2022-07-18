package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.InfoPlanEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InfoPlanEstudioRepository extends JpaRepository<InfoPlanEstudio, Integer> {
}
