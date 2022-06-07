package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.*;
import cr.ac.ucr.ie.sigie.repository.CursoRepository;
import org.junit.jupiter.api.*;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

class CursoServiceTest {
    @Mock
    private CursoRepository repository;
    private CursoService service;
    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
        service = new CursoService(repository);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canListAll() {
        //when
        service.listAll();
        //then
        verify(repository).findAll();
    }

    @Test
    void canSave() {
        //given
        Curso curso = new Curso();

        curso.setIdCurso(1);
        curso.setNombre("Programación V");
        curso.setCiclo("III");
        curso.setAreaDisciplinaria(new AreaDisciplinaria());
        curso.setContenidos(new ArrayList<Contenido>());
        curso.setCorrequisitos(new ArrayList<Curso>());
        curso.setCreditos(3);
        curso.setElectivo(true);
        curso.setEnfasis(new ArrayList<Enfasis>());
        curso.setHorasLaboratorio(2);
        curso.setHorasPractica(2);
        curso.setHorasTeoria(2);
        curso.setHorasTeoricoPractica(2);
        curso.setItemesDescripcion(new ArrayList<ItemDescripcion>());
        curso.setModalidad(new Modalidad());
        curso.setObjetivoGeneral("aprender");
        curso.setPlanEstudio(new PlanEstudio());
        curso.setRequisitos(new ArrayList<Curso>());
        curso.setResultadosDeAprendizaje(new ArrayList<ResultadosAprendizaje>());
        curso.setReferenciasBibliograficas(new ArrayList<ReferenciaBibliografica>());
        curso.setSigla("IF7233");
        curso.setUnidadesAcademicasPropietarias(new ArrayList<UnidadAcademica>());
        curso.setElectivos(new ArrayList<Curso>());
        //when
        service.save(curso);
        //then
        ArgumentCaptor<Curso> cursoArgumentCaptor = ArgumentCaptor.forClass(Curso.class);
        verify(repository).save(cursoArgumentCaptor.capture());
        Curso capturedCurso = cursoArgumentCaptor.getValue();
        assertThat(capturedCurso).isEqualTo(curso);
    }

    @Test
    void get() {
        //given
        int i = 1;
        //then
        repository.findById(i);
    }

    @Test
    void canDelete() {
        //given
        int i = 1;
        //then
        repository.deleteById(i);
    }
}