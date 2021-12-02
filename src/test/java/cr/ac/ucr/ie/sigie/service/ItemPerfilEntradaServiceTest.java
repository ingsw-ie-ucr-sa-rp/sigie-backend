package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.entity.TipoPerfilSa;
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

    @Autowired
    private TipoPerfilEntradaService tipoPerfilEntradaService;


    @Test
    void listAll() {
        List<ItemPerfilEntrada> itemPerfilEntradaList= itemPerfilEntradaService.listAll();
        assertTrue(itemPerfilEntradaList.size()>=1);
    }

    @Test
    void save() {
        ItemPerfilEntrada itemPerfilEntrada = new ItemPerfilEntrada();
        TipoPerfilSa tipoPerfilEntrada = tipoPerfilEntradaService.get(1);
        itemPerfilEntrada.setTipoPerfilEntrada(tipoPerfilEntrada);
        itemPerfilEntrada.setDescripcion("Test");
        itemPerfilEntradaService.save(itemPerfilEntrada);
        assertTrue(itemPerfilEntradaService.get(itemPerfilEntrada.getIdItem()) != null);
    }

    @Test
    void get() {
        assertTrue(itemPerfilEntradaService.get(1) != null);
    }

    @Test
    void delete() {
        for (ItemPerfilEntrada itemPerfilEntrada:itemPerfilEntradaService.listAll()) {
            if(itemPerfilEntrada.getDescripcion().equalsIgnoreCase("Test")){
                int idToDelete = itemPerfilEntrada.getIdItem();
                itemPerfilEntradaService.delete(idToDelete);
                assertTrue(!itemPerfilEntradaService.existsById(idToDelete));
            }
        }
    }

}