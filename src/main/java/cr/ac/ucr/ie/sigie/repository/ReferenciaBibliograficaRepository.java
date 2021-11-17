package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.ReferenciaBibliografica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenciaBibliograficaRepository extends JpaRepository<ReferenciaBibliografica, Integer> {
}
