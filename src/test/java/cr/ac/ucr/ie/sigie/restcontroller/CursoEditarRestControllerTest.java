package cr.ac.ucr.ie.sigie.restcontroller;//package cr.ac.proyecto.analisis.restcontroller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class CursoEditarRestControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@Test
	@DisplayName("Prueba editarCursoTest")
	void editarCurso() throws Exception {

		PlanEstudio planEstudio = new PlanEstudio(1, 2020, 8, "600002", 4, "Informática Empresarial", null, null,
				null, null);

		Curso curso = new Curso(1, "EG-", "Curso de Arte", 4 , 1, 1, 1, (byte) 0, 1, 1, 1, 1, "Objetivo General", null, null,
				null, null, planEstudio, null, null, null, null, null, null);

		this.mockMvc.perform(put("http://localhost:8080/api/curso/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(curso)))
				.andExpect(status().isOk());
	}

	public String asJsonString(final Object obj) throws JsonProcessingException {
		return new ObjectMapper().writeValueAsString(obj);
	}

}
