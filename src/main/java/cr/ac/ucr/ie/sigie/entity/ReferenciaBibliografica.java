package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
public class ReferenciaBibliografica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBibliografia;
    @Column(name = "referencia", unique = false, length = 512, nullable = false)
    private String referencia;

    public ReferenciaBibliografica() {
    }

    public int getIdBibliografia() {
        return idBibliografia;
    }

    public void setIdBibliografia(int idBibliografia) {
        this.idBibliografia = idBibliografia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }
}
