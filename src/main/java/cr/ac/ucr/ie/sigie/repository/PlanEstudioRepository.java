package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanEstudioRepository extends JpaRepository<PlanEstudio, Integer> {
}
