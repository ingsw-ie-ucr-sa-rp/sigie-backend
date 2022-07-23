package cr.ac.ucr.ie.sigie.interfaces.sigiebackend;

import cr.ac.ucr.ie.sigie.dto.get.CursosPertenecientesABloqueGetDTO;
import cr.ac.ucr.ie.sigie.entity.Curso;

import java.util.List;

public interface IBloqueElectivos {
    int getIdBloqueElectivo();

    List<CursosPertenecientesABloqueGetDTO> getCursosPertenecientes();
}
