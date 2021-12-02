package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    @Query(value = "SELECT * FROM curso", nativeQuery = true)
    Optional<Curso> buscar();
    public List<Curso> getByPlanId(Integer planId);

}
