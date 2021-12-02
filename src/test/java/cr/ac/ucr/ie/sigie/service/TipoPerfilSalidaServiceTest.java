package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.TipoPerfilSa;
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
class TipoPerfilSalidaServiceTest {


    @Autowired
    private TipoPerfilSalidaService tipoPerfilSalidaService;

    @Test
    void listAll() {
        List<TipoPerfilSalida> tipoPerfilSalidas= tipoPerfilSalidaService.listAll();
        assertTrue(tipoPerfilSalidas.size()>=1);
    }

    @Test
    void save() {
        TipoPerfilSalida tipoPerfilSalida = new TipoPerfilSalida();
        tipoPerfilSalida.setNombreTipo("Test");
        tipoPerfilSalidaService.save(tipoPerfilSalida);
        assertTrue(tipoPerfilSalidaService.get(tipoPerfilSalida.getIdTipo()) != null);
    }

    @Test
    void get() {
        assertTrue(tipoPerfilSalidaService.get(1) != null);
    }

    @Test
    void delete() {
        for (TipoPerfilSalida tipoPerfilSalida:tipoPerfilSalidaService.listAll()) {
            if(tipoPerfilSalida.getNombreTipo().equalsIgnoreCase("Test")){
                int idToDelete = tipoPerfilSalida.getIdTipo();
                tipoPerfilSalidaService.delete(idToDelete);
                assertTrue(!tipoPerfilSalidaService.existsById(idToDelete));
            }
        }
    }
}