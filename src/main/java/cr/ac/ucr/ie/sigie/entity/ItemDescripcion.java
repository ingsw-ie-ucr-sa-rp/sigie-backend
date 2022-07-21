package cr.ac.ucr.ie.sigie.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
public class ItemDescripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDescripcion;

    @Column(name = "ordenDescripcion", unique = false, nullable = false)
    private int ordenDescripcion;

    @Column(name = "detalleDescripcion", unique = false, length = 512, nullable = false)
    private String detalleDescripcion;

    public ItemDescripcion() {
    }

    public int getIdDescripcion() {
        return idDescripcion;
    }

    public void setIdDescripcion(int idDescripcion) {
        this.idDescripcion = idDescripcion;
    }

    public int getOrdenDescripcion() {
        return ordenDescripcion;
    }

    public void setOrdenDescripcion(int ordenDescripcion) {
        this.ordenDescripcion = ordenDescripcion;
    }

    public String getDetalleDescripcion() {
        return detalleDescripcion;
    }

    public void setDetalleDescripcion(String detalleDescripcion) {
        this.detalleDescripcion = detalleDescripcion;
    }
}

