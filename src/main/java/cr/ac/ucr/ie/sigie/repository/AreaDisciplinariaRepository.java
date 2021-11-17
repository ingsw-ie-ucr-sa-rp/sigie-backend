package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AreaDisciplinariaRepository extends JpaRepository<AreaDisciplinaria, Integer> {
}
