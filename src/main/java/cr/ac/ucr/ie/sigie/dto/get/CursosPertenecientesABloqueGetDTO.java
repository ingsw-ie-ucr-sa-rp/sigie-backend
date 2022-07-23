package cr.ac.ucr.ie.sigie.dto.get;

import lombok.Data;

import java.io.Serializable;

@Data
public class CursosPertenecientesABloqueGetDTO implements Serializable {
    private int idCurso;
    private String sigla;
    private String nombre;
}
