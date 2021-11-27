package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
public class ItemPerfilSalida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPerfilSalida;

    @Column(name = "descripcion", unique = false, length = 512, nullable = false)
    private String descripcion;

    public ItemPerfilSalida() {

    }

    public int getIdTipoPerfilSalida() {
        return idTipoPerfilSalida;
    }

    public void setIdTipoPerfilSalida(int idTipoPerfilSalida) {
        this.idTipoPerfilSalida = idTipoPerfilSalida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
