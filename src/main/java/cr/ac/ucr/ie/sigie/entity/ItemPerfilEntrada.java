package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;


@Entity
@Table(name="itemPerfilEntrada")
public class ItemPerfilEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_item")
    private int idItem;

    @Column(name = "descripcion", unique = false, length = 512, nullable = false)
    private String descripcion;

    @ManyToOne(targetEntity = TipoPerfilSa.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional=false)
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo", nullable = false)
    private TipoPerfilSa tipoPerfilEntrada;

    public ItemPerfilEntrada() {
        tipoPerfilEntrada = new TipoPerfilSa();
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public TipoPerfilSa getTipoPerfilEntrada() {
        return tipoPerfilEntrada;
    }

    public void setTipoPerfilEntrada(TipoPerfilSa tipoPerfilEntrada) {
        this.tipoPerfilEntrada = tipoPerfilEntrada;
    }
}
