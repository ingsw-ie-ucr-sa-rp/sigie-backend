package cr.ac.ucr.ie.sigie;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.entity.Contenido;
import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.entity.Enfasis;
import cr.ac.ucr.ie.sigie.repository.CursoRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.ArrayList;
import java.util.List;

//@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
class SigieBackendApplicationTests {

    @Autowired
    private CursoRepository cursoRepository;

    @Test
    public void testAdd() {
        List<Contenido> listaContenidos = new ArrayList<>();
        List<Curso> listaCorrequisitos = new ArrayList<>();
        List<Curso> listaElectivos = new ArrayList<>();
        List<Enfasis> listaEnfasis = new ArrayList<>();

        AreaDisciplinaria areaD = new AreaDisciplinaria();
        areaD.setNombreDisciplinaria("Ciencia");


        Curso curso = new Curso();
        curso.setSigla("IF123");
        curso.setObjetivoGeneral("Aprobar");
        curso.setNombre("CursoPrueba");
        curso.setAreaDisciplinaria(areaD);
        curso.setCiclo("1");
        curso.setContenidos(listaContenidos);
        curso.setCorrequisitos(listaCorrequisitos);
        curso.setCreditos(4);
        curso.setElectivo(true);
        curso.setElectivos(listaElectivos);
        curso.setEnfasis(listaEnfasis);
        curso.setHorasLaboratorio(5);
        curso.setHorasPractica(4);
        curso.setHorasTeoria(5);
        curso.setHorasTeoricoPractica(5);

        Curso guardado = this.cursoRepository.save(curso);

        Assertions.assertThat(guardado).isNotNull();
    }

    /*
    @Test
    void contextLoads() {
    }
    */
}
