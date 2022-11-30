package cr.ac.ucr.ie.sigie.entity;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*;

@Entity
public class DescripcionPlanEstudio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDescripcionPlanEstudio;

    @Column(name = "ordenDescripcionPlanEstudio", unique = false, nullable = false)
    private int ordenDescripcionPlanEstudio;

    @Column(name = "detalleDescripcionPlanEstudio", unique = false, length = 512, nullable = false)
    private String detalleDescripcionPlanEstudio;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "idPlanEstudio", nullable = true)
    @JsonIgnoreProperties("descripcionesPlanEstudio")
    private PlanEstudio planEstudio;

    public DescripcionPlanEstudio(){
        //planEstudio = new PlanEstudio();
    }

    public int getIdDescripcionPlanEstudio() {
        return idDescripcionPlanEstudio;
    }

    public void setIdDescripcionPlanEstudio(int idDescripcionPlanEstudio) {
        this.idDescripcionPlanEstudio = idDescripcionPlanEstudio;
    }

    public int getOrdenDescripcionPlanEstudio() {
        return ordenDescripcionPlanEstudio;
    }

    public void setOrdenDescripcionPlanEstudio(int ordenDescripcionPlanEstudio) {
        this.ordenDescripcionPlanEstudio = ordenDescripcionPlanEstudio;
    }

    public String getDetalleDescripcionPlanEstudio() {
        return detalleDescripcionPlanEstudio;
    }

    public void setDetalleDescripcionPlanEstudio(String detalleDescripcionPlanEstudio) {
        this.detalleDescripcionPlanEstudio = detalleDescripcionPlanEstudio;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }
}
