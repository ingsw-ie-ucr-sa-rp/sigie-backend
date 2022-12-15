package cr.ac.ucr.ie.sigie.repository;

import cr.ac.ucr.ie.sigie.entity.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

class PlanEstudioServiceTest {
    @Mock
    private PlanEstudioRepository repository;
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
        PlanEstudio planEstudio = new PlanEstudio();

        planEstudio.setIdPlanEstudio(1);
        planEstudio.setAnoAprobacion(2020);
        planEstudio.setCantidadCiclos(3);
        planEstudio.setCodigoCarrera(20000);
        planEstudio.setDuracionAnos(3);
        planEstudio.setNombreCarrera("Carrera test");
        planEstudio.setModalidad("Presencial");
        planEstudio.setPeriodicidad("Semestral");
        planEstudio.setImagenesRelacionadas((byte)12);
        planEstudio.setActivo(false);

        Curso curso = new Curso();
        curso.setIdCurso(1);
        curso.setNombre("Programación V");
        curso.setCiclo("III");
        curso.setCreditos(3);
        curso.setElectivo(true);
        curso.setHorasLaboratorio(2);
        curso.setHorasPractica(2);
        curso.setHorasTeoria(2);
        curso.setHorasTeoricoPractica(2);
        curso.setObjetivoGeneral("Aprendizaje");

        curso.setPlanEstudio(planEstudio);
        curso.setRequisitos(new ArrayList<Curso>());
        curso.setResultadosDeAprendizaje(new ArrayList<ResultadosAprendizaje>());
        curso.setReferenciasBibliograficas(new ArrayList<ReferenciaBibliografica>());
        curso.setSigla("IF7233");
        curso.setUnidadesAcademicasPropietarias(new ArrayList<UnidadAcademica>());
        curso.setElectivos(new ArrayList<Curso>());

        planEstudio.setCursos(new ArrayList<Curso>());

        Enfasis enfasis = new Enfasis();
        enfasis.setIdEnfasis(1);
        enfasis.setDescripcion("Diversas áreas");
        enfasis.setCursos(new ArrayList<Curso>());
        enfasis.setPlanEstudio(planEstudio);
        planEstudio.setEnfasis(new ArrayList<Enfasis>());

        UnidadAcademica unidadAcademica = new UnidadAcademica();
        unidadAcademica.setIdUnidadAcademica(1);
        unidadAcademica.setNombreUnidadAcademica("Recinto");
        unidadAcademica.setCursosPropios(new ArrayList<Curso>());
        unidadAcademica.setPlanesEstudio(new ArrayList<PlanEstudio>());
        planEstudio.setUnidadesAcademicasPropietarias(new ArrayList<UnidadAcademica>());

        ItemPerfilEntrada itemPerfilEntrada = new ItemPerfilEntrada();
        itemPerfilEntrada.setIdTipoPerfilEntrada(1);
        itemPerfilEntrada.setDescripcion("Proyección internacional");
        itemPerfilEntrada.setOrden(1);
        itemPerfilEntrada.setTipoPerfilEntrada(new TipoItemPerfilEntrada());
        itemPerfilEntrada.setPlanEstudio(planEstudio);
        planEstudio.setItemesPerfilEntrada(new ArrayList<ItemPerfilEntrada>());

        ItemPerfilSalida itemPerfilSalida = new ItemPerfilSalida();
        itemPerfilSalida.setIdTipoPerfilSalida(1);
        itemPerfilSalida.setDescripcion("Mercado Laboral");
        itemPerfilSalida.setOrden(1);
        itemPerfilSalida.setTipoPerfilSalida(new TipoItemPerfilSalida());
        itemPerfilSalida.setPlanEstudio(planEstudio);
        planEstudio.setItemesPerfilSalida(new ArrayList<ItemPerfilSalida>());

        Grado grado = new Grado();
        grado.setIdGrado(1);
        grado.setNombre("GradoTest");
        grado.setTotalCreditosMaximo(2);
        grado.setTotalCreditosMinimo(1);
        grado.setPlanesEstudio(new ArrayList<PlanEstudio>());

        planEstudio.setGrado(grado);

        AreaDisciplinaria areaDisciplinaria = new AreaDisciplinaria();
        areaDisciplinaria.setIdAreaDisciplinaria(1);
        areaDisciplinaria.setNombre("a");
        areaDisciplinaria.setCursos(new ArrayList<Curso>());
        areaDisciplinaria.setPlanEstudio(planEstudio);

        planEstudio.setAreaDisciplinaria(new ArrayList<AreaDisciplinaria>());

        //when
        repository.save(planEstudio);

        //then
        ArgumentCaptor<PlanEstudio> planEstudioArgumentCaptor = ArgumentCaptor.forClass(PlanEstudio.class);
        verify(repository).save(planEstudioArgumentCaptor.capture());
        PlanEstudio capturedPlanEstudio = planEstudioArgumentCaptor.getValue();
        assertThat(capturedPlanEstudio).isEqualTo(planEstudio);
    }

}