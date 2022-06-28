package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.*;
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
    private AutoCloseable autoCloseable;

    @BeforeEach
    void setUp() {
        autoCloseable = MockitoAnnotations.openMocks(this);
    }

    @AfterEach
    void tearDown() throws Exception {
        autoCloseable.close();
    }

    @Test
    void canSave() {
        //given
        Curso curso = new Curso();

        curso.setIdCurso(1);
        curso.setNombre("Programación V");
        curso.setCiclo("III");

        AreaDisciplinaria areaDisciplinaria = new AreaDisciplinaria();
        areaDisciplinaria.setIdAreaDisciplinaria(1);
        areaDisciplinaria.setNombre("a");
        areaDisciplinaria.setCursos(new ArrayList<Curso>());

        curso.setAreaDisciplinaria(areaDisciplinaria);
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

        Modalidad modalidad = new Modalidad();
        modalidad.setIdModalidad(1);
        modalidad.setTipoModalidad("Virtual");
        modalidad.setCursos(new ArrayList<Curso>());

        curso.setModalidad(modalidad);
        curso.setObjetivoGeneral("aprender");

        PlanEstudio planEstudio = new PlanEstudio();
        planEstudio.setIdPlanEstudio(1);
        planEstudio.setAnoAprobacion(2020);
        planEstudio.setCantidadCiclos(3);
        planEstudio.setCodigoCarrera(20000);
        planEstudio.setDuracionAnos(3);
        planEstudio.setNombreCarrera("Carrera test");
        planEstudio.setCursos(new ArrayList<Curso>());
        planEstudio.setEnfasis(new ArrayList<Enfasis>());
        planEstudio.setUnidadesAcademicasPropietarias(new ArrayList<UnidadAcademica>());
        planEstudio.setItemesPerfilEntrada(new ArrayList<ItemPerfilEntrada>());
        planEstudio.setItemesPerfilSalida(new ArrayList<ItemPerfilSalida>());

        Grado grado = new Grado();
        grado.setIdGrado(1);
        grado.setNombre("GradoTest");
        grado.setTotalCreditosMaximo(2);
        grado.setTotalCreditosMinimo(1);
        grado.setPlanesEstudio(new ArrayList<PlanEstudio>());

        planEstudio.setGrado(grado);

        curso.setPlanEstudio(planEstudio);
        curso.setRequisitos(new ArrayList<Curso>());
        curso.setResultadosDeAprendizaje(new ArrayList<ResultadosAprendizaje>());
        curso.setReferenciasBibliograficas(new ArrayList<ReferenciaBibliografica>());
        curso.setSigla("IF7233");
        curso.setUnidadesAcademicasPropietarias(new ArrayList<UnidadAcademica>());
        curso.setElectivos(new ArrayList<Curso>());

        //when
        repository.save(curso);

        //then
        ArgumentCaptor<Curso> cursoArgumentCaptor = ArgumentCaptor.forClass(Curso.class);
        verify(repository).save(cursoArgumentCaptor.capture());
        Curso capturedCurso = cursoArgumentCaptor.getValue();
        assertThat(capturedCurso).isEqualTo(curso);
    }

}