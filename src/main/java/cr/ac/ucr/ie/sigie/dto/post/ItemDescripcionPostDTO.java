package cr.ac.ucr.ie.sigie.dto.post;

import lombok.Data;

import java.io.Serializable;
@Data
public class ItemDescripcionPostDTO implements Serializable {
    private String detalleDescripcion;
    private int ordenDescripcion;
}
