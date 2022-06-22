package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Enfasis;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IEnfasis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EnfasisRepository extends JpaRepository<Enfasis, Integer> {
    List<IEnfasis> findAllBy();
}
