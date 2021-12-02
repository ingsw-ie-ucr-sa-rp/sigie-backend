package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.Enfasis;
import cr.ac.ucr.ie.sigie.entity.Grado;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class GradoServiceTest {

    @Autowired
    private GradoService gradoService;

    @Test
    void listAll() {
        List<Grado> grados= gradoService.listAll();
        assertTrue(grados.size()>=1);
    }

    @Test
    void save() {
        Grado grado = new Grado();
        grado.setNombre("Test");
        grado.setTotalCreditosMaximo(4);
        grado.setTotalCreditosMinimo(3);
        gradoService.save(grado);
        assertTrue(gradoService.get(grado.getIdGrado()) != null);
    }

    @Test
    void get() {
        assertTrue(gradoService.get(1) != null);
    }

    @Test
    void delete() {
        for (Grado grado:gradoService.listAll()) {
            if(grado.getNombre().equalsIgnoreCase("Test")){
                int idToDelete = grado.getIdGrado();
                gradoService.delete(idToDelete);
                assertTrue(!gradoService.existsById(idToDelete));
            }
        }
    }
}