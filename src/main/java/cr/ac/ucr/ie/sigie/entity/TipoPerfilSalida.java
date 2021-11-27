package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class TipoPerfilSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;
    @Column(name = "nombreTipo", unique = false, length = 256, nullable = false)
    private String nombreTipo;

    public TipoPerfilSalida() {

    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }
}
