package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class ItemPerfilEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPerfilEntrada;

    @Column(name = "descripcion", unique = false, length = 512, nullable = false)
    private String descripcion;


    public ItemPerfilEntrada() {

    }

    public int getIdTipoPerfilEntrada() {
        return idTipoPerfilEntrada;
    }

    public void setIdTipoPerfilEntrada(int idTipoPerfilEntrada) {
        this.idTipoPerfilEntrada = idTipoPerfilEntrada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
