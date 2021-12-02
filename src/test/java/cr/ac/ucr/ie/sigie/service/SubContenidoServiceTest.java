package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.ReferenciaBibliografica;
import cr.ac.ucr.ie.sigie.entity.SubContenido;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class SubContenidoServiceTest {

    @Autowired
    private SubContenidoService subContenidoService;

    @Test
    void listAll() {
        List<SubContenido> subContenidos= subContenidoService.listAll();
        assertTrue(subContenidos.size()>=1);
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