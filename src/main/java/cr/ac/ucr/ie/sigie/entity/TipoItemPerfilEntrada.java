package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name="tipo_item_perfil_entrada")
public class TipoItemPerfilEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo")
    private short idTipo;

    @Column(name="nombre_tipo", unique = true, length = 20, nullable = false)
    private String nombreTipo;

    @OneToMany(targetEntity = ItemPerfilEntrada.class,fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo",nullable = false)
    private List<TipoItemPerfilEntrada> TiposPerfilEntrada;

    public TipoItemPerfilEntrada(short idTipo, String nombreTipo, List<TipoItemPerfilEntrada> tiposPerfilEntrada) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
        TiposPerfilEntrada = new ArrayList<TipoItemPerfilEntrada>();
    }

    public TipoItemPerfilEntrada() {
        this.idTipo = 0;
        this.nombreTipo ="";
        TiposPerfilEntrada = new ArrayList<TipoItemPerfilEntrada>();

    }

    public short getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(short idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public List<TipoItemPerfilEntrada> getTiposPerfilEntrada() {
        return TiposPerfilEntrada;
    }

    public void setTiposPerfilEntrada(List<TipoItemPerfilEntrada> tiposPerfilEntrada) {
        TiposPerfilEntrada = tiposPerfilEntrada;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + idTipo;//id de la clase***
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TipoItemPerfilEntrada other = (TipoItemPerfilEntrada) obj;
        if (idTipo != other.idTipo)//id de la clase***
            return false;
        return true;
    }

}
