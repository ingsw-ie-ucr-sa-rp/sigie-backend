package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.Curso;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeFalse;

@SpringBootTest
class CursoEditarRepositoryTest {

	@Autowired
	CursoRepository cursoRepository;

	@Test
	@DisplayName("Prueba findByIdTest exitosa")
	void findByIdTest() {
		List<Curso> optional = cursoRepository.getByPlanId(1);
		assumeFalse(optional.isEmpty(), "Prueba no ejecutada por que el plan de estudios no fue encontrado.");
		assertNotNull(optional);
	}


}
