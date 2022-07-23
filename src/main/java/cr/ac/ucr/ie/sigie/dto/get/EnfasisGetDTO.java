package cr.ac.ucr.ie.sigie.dto.get;

import lombok.Data;

import java.io.Serializable;

@Data
public class EnfasisGetDTO implements Serializable {
    private int idEnfasis;
    private String descripcion;
}
