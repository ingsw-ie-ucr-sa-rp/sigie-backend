package cr.ac.ucr.ie.sigie.repository;


import cr.ac.ucr.ie.sigie.entity.Grado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Integer> {
}
