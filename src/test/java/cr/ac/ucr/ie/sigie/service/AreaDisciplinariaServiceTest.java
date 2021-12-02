package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.repository.AreaDisciplinariaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.awt.geom.Area;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AreaDisciplinariaServiceTest {

    @Autowired
    private AreaDisciplinariaService areaDisciplinariaService;


    @Test
    void listAll() {
        assertTrue(areaDisciplinariaService.listAll().size()>=1);
    }

    @Test
    void save() {
        AreaDisciplinaria areaDisciplinaria = new AreaDisciplinaria();
        areaDisciplinaria.setNombreDisciplinaria("Test");
        areaDisciplinariaService.save(areaDisciplinaria);
        assertTrue(areaDisciplinariaService.get(areaDisciplinaria.getIdAreaDisciplinaria()) != null);
    }

    @Test
    void get() {
        assertTrue(areaDisciplinariaService.get(1) != null);
    }

    @Test
    void delete() {
        for (AreaDisciplinaria areaDisciplinaria:areaDisciplinariaService.listAll()) {
            if(areaDisciplinaria.getNombreDisciplinaria().equalsIgnoreCase("Test")){
                int idToDelete = areaDisciplinaria.getIdAreaDisciplinaria();
                areaDisciplinariaService.delete(idToDelete);
                assertTrue(!areaDisciplinariaService.existsById(idToDelete));
            }
        }
    }
}