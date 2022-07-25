package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
public class TipoPerfilEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;
    @Column(name = "nombreTipo", unique = false, length = 256, nullable = false)
    private String nombreTipo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTipoPerfilEntrada")
    private ItemPerfilEntrada itemPerfilEntrada;

    public TipoPerfilEntrada() {

    }

    public TipoPerfilEntrada(int idTipo, String nombreTipo) {
        this.idTipo = idTipo;
        this.nombreTipo = nombreTipo;
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

    public ItemPerfilEntrada getItemPerfilEntrada() {
        return itemPerfilEntrada;
    }

    public void setItemPerfilEntrada(ItemPerfilEntrada itemPerfilEntrada) {
        this.itemPerfilEntrada = itemPerfilEntrada;
    }
}
