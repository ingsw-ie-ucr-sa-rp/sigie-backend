package cr.ac.ucr.ie.sigie.business;
import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import cr.ac.ucr.ie.sigie.service.CursoService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertNotEquals;


@SpringBootTest
class CursoEditarBusinessTest {

	@Autowired
    CursoService cursoService;

	@Test
	@DisplayName("Prueba guardarTest exitosa")
	void editarCurso() {
		PlanEstudio planEstudio = new PlanEstudio(1, 2020, 8, "600002", 4, "Informática Empresarial", null, null,
				null, null);

		Curso curso = new Curso(1, "EG-", "Curso de Arte", 4 , 1, 1, 1, (byte) 0, 1, 1, 1, 1, "Objetivo General", null, null,
				null, null, planEstudio, null, null, null, null, null, null);

		assertNotEquals(curso.getIdcurso(), 0);


	}
}
