package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class PlanEstudioServiceTest {

    @Autowired
    private PlanEstudioService planEstudioService;

    @Autowired
    private GradoService gradoService;


    @Test
    void listAll() {
        List<PlanEstudio> planesDeEstudio= planEstudioService.listAll();
        assertTrue(planesDeEstudio.size()>=1);
    }

    @Test
    void save() {
        PlanEstudio planEstudio = new PlanEstudio();
        planEstudio.setAnoAprobacion(1);
        planEstudio.setCantidadCiclos(3);
        planEstudio.setCodigoCarrera(123122);
        planEstudio.setNombreCarrera("Test");
        planEstudio.setDuracionAnos(2);

        Grado grado = gradoService.get(1);
        planEstudio.setGrado(grado);
        planEstudioService.save(planEstudio);
        assertTrue(planEstudioService.get(planEstudio.getIdPlanEstudio()) != null);
    }

    @Test
    void get() {
        assertTrue(planEstudioService.get(1) != null);
    }

    @Test
    void delete() {
        for (PlanEstudio planEstudio:planEstudioService.listAll()) {
            if(planEstudio.getNombreCarrera().equalsIgnoreCase("Test")){
                int idToDelete = planEstudio.getIdPlanEstudio();
                planEstudioService.delete(idToDelete);
                assertTrue(!planEstudioService.existsById(idToDelete));
            }
        }
    }
}