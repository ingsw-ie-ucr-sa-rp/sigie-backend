package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.ItemDescripcion;
import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ItemPerfilEntradaServiceTest {

    @Autowired
    private ItemPerfilEntradaService itemPerfilEntradaService;

    @Test
    void listAll() {
        List<ItemPerfilEntrada> itemPerfilEntradaList= itemPerfilEntradaService.listAll();
        assertTrue(itemPerfilEntradaList.size()>=1);
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