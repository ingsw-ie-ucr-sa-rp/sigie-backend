package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.TipoPerfilEntrada;
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
class TipoPerfilEntradaServiceTest {

    @Autowired
    private TipoPerfilEntradaService tipoPerfilEntradaService;

    @Test
    void listAll() {
        List<TipoPerfilEntrada> tiposDePerfilEntrada= tipoPerfilEntradaService.listAll();
        assertTrue(tiposDePerfilEntrada.size()>=1);
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