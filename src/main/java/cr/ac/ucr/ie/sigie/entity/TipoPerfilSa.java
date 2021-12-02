package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
@Table(name="tipoPerfilEntrada")
public class TipoPerfilSa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo")
    private int idTipo;
    @Column(name = "nombreTipo", unique = false, length = 256, nullable = false)
    private String nombreTipo;

    public TipoPerfilSa() {

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
