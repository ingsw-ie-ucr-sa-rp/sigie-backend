package cr.ac.ucr.ie.sigie.service;

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
class TipoPerfilEntradaServiceTest {

    @Autowired
    private TipoPerfilEntradaService tipoPerfilEntradaService;

    @Test
    void listAll() {
        List<TipoPerfilSa> tiposDePerfilEntrada= tipoPerfilEntradaService.listAll();
        assertTrue(tiposDePerfilEntrada.size()>=1);
    }

    @Test
    void save() {
        TipoPerfilSa tipoPerfilEntrada = new TipoPerfilSa();
        tipoPerfilEntrada.setNombreTipo("Test");
        tipoPerfilEntradaService.save(tipoPerfilEntrada);
        assertTrue(tipoPerfilEntradaService.get(tipoPerfilEntrada.getIdTipo()) != null);
    }

    @Test
    void get() {
        assertTrue(tipoPerfilEntradaService.get(1) != null);
    }

    @Test
    void delete() {
        for (TipoPerfilSa tipoPerfilEntrada:tipoPerfilEntradaService.listAll()) {
            if(tipoPerfilEntrada.getNombreTipo().equalsIgnoreCase("Test")){
                int idToDelete = tipoPerfilEntrada.getIdTipo();
                tipoPerfilEntradaService.delete(idToDelete);
                assertTrue(!tipoPerfilEntradaService.existsById(idToDelete));
            }
        }
    }
}