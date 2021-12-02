package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="tipo_item_perfil_salida")
public class TipoItemPerfilSalida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo")
    private int idTipo;
    @Column(name="nombre_tipo", length = 50, nullable = false)
    private String nombreTipo;
    @OneToMany(targetEntity = ItemPerfilSalida.class,fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name ="id_tipo", referencedColumnName = "id_tipo",nullable = false)
    private List<ItemPerfilSalida> itemesPerfilSalida;

    public TipoItemPerfilSalida(int idTipo, String nombreTipo, List<ItemPerfilSalida> itemesPerfilSalida) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
        this.itemesPerfilSalida = new ArrayList<ItemPerfilSalida>();
    }

    public TipoItemPerfilSalida() {
        this.idTipo = 0;
        this.nombreTipo = "";
        this.itemesPerfilSalida = new ArrayList<ItemPerfilSalida>();
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

    public List<ItemPerfilSalida> getItemesPerfilSalida() {
        return itemesPerfilSalida;
    }

    public void setItemesPerfilSalida(List<ItemPerfilSalida> itemesPerfilSalida) {
        this.itemesPerfilSalida = itemesPerfilSalida;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + idTipo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TipoItemPerfilSalida other = (TipoItemPerfilSalida) obj;
        if (idTipo != other.idTipo)
            return false;
        return true;
    }


}//end class
