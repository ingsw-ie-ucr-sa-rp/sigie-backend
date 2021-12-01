package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.Modalidad;
import cr.ac.ucr.ie.sigie.entity.PlanEstudio;
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


    @Test
    void listAll() {
        List<PlanEstudio> planesDeEstudio= planEstudioService.listAll();
        assertTrue(planesDeEstudio.size()>=1);
    }

    @Test
    void save() {
    }

    @Test
    void get() {
    }

    @Test
    void delete() {
    }
}