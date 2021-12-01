package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.repository.AreaDisciplinariaRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AreaDisciplinariaServiceTest {

    @Autowired
    private AreaDisciplinariaService areaDisciplinariaService;


    @Test
    void listAll() {
        List<AreaDisciplinaria> areas= areaDisciplinariaService.listAll();
        assertTrue(areas.size()>=1);
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