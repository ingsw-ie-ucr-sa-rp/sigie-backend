package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class TipoItemPerfilEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipo;
    @Column(name = "nombreTipo", unique = false, length = 256, nullable = false)
    private String nombreTipo;
    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "tipoItemPerfilEntrada", orphanRemoval = true)
    private List<ItemPerfilEntrada> itemesPerfilEntrada;

    public TipoItemPerfilEntrada() {
        itemesPerfilEntrada = new ArrayList<>();
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

    public List<ItemPerfilEntrada> getItemesPerfilEntrada() {
        return itemesPerfilEntrada;
    }

    public void setItemesPerfilEntrada(List<ItemPerfilEntrada> itemesPerfilEntrada) {
        this.itemesPerfilEntrada = itemesPerfilEntrada;
    }
}