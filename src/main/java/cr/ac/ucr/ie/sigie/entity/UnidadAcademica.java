package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class UnidadAcademica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUnidadAcademica;
    @Column(name = "nombreUnidadAcademica", unique = false, length = 256, nullable = false)
    private String nombreUnidadAcademica;
    @ManyToMany(fetch = FetchType.LAZY)
    private List<PlanEstudio> planesEstudio;

    public UnidadAcademica() {
        planesEstudio = new ArrayList<>();
    }

    public int getIdUnidadAcademica() {
        return idUnidadAcademica;
    }

    public void setIdUnidadAcademica(int idUnidadAcademica) {
        this.idUnidadAcademica = idUnidadAcademica;
    }

    public String getNombreUnidadAcademica() {
        return nombreUnidadAcademica;
    }

    public void setNombreUnidadAcademica(String nombreUnidadAcademica) {
        this.nombreUnidadAcademica = nombreUnidadAcademica;
    }

    public List<PlanEstudio> getPlanesEstudio() {
        return planesEstudio;
    }

    public void setPlanesEstudio(List<PlanEstudio> planesEstudio) {
        this.planesEstudio = planesEstudio;
    }
}
