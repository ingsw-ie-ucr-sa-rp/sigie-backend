package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Enfasis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnfasisRepository extends JpaRepository<Enfasis, Integer> {
}
