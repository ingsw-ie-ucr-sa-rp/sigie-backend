package cr.ac.ucr.ie.sigie.dto.get;

import lombok.Data;

import java.io.Serializable;

@Data
public class ModalidadGetDTO implements Serializable {
    private int idModalidad;
    private String tipoModalidad;
}
