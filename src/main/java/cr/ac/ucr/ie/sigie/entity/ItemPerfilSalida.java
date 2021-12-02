package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
@Table(name="itemPerfilSalida")
public class ItemPerfilSalida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_item")
    private int idItem;

    @Column(name = "descripcion", unique = false, length = 512, nullable = false)
    private String descripcion;

    @ManyToOne(targetEntity = TipoPerfilSalida.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional=false)
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo", nullable = false)
    private TipoPerfilSalida tipoPerfilSalida;

    public ItemPerfilSalida() {
        tipoPerfilSalida = new TipoPerfilSalida();
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public TipoPerfilSalida getTipoPerfilSalida() {
        return tipoPerfilSalida;
    }

    public void setTipoPerfilSalida(TipoPerfilSalida tipoPerfilSalida) {
        this.tipoPerfilSalida = tipoPerfilSalida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
