package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.ItemPerfilSalida;
import cr.ac.ucr.ie.sigie.entity.TipoPerfilSalida;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ItemPerfilSalidaServiceTest {

    @Autowired
    private ItemPerfilSalidaService itemPerfilSalidaService;

    @Autowired
    private TipoPerfilSalidaService tipoPerfilSalidaService;

    @Test
    void listAll() {
        List<ItemPerfilSalida> ItemPerfilSalidaList= itemPerfilSalidaService.listAll();
        assertTrue(ItemPerfilSalidaList.size()>=1);
    }

    @Test
    void save() {
        ItemPerfilSalida itemPerfilSalida = new ItemPerfilSalida();
        TipoPerfilSalida tipoPerfilSalida = tipoPerfilSalidaService.get(1);
        itemPerfilSalida.setTipoPerfilSalida(tipoPerfilSalida);
        itemPerfilSalida.setDescripcion("Test");
        itemPerfilSalidaService.save(itemPerfilSalida);
        assertTrue(tipoPerfilSalidaService.get(itemPerfilSalida.getIdItem()) != null);
    }

    @Test
    void get() {
        assertTrue(tipoPerfilSalidaService.get(1) != null);
    }

    @Test
    void delete() {
        for (ItemPerfilSalida itemPerfilSalida:itemPerfilSalidaService.listAll()) {
            if(itemPerfilSalida.getDescripcion().equalsIgnoreCase("Test")){
                int idToDelete = itemPerfilSalida.getIdItem();
                tipoPerfilSalidaService.delete(idToDelete);
                assertTrue(!tipoPerfilSalidaService.existsById(idToDelete));
            }
        }
    }
}