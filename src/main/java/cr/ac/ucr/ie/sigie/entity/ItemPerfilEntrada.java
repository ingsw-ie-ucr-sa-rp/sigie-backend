package cr.ac.ucr.ie.sigie.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
public class ItemPerfilEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPerfilEntrada;

    @Column(name = "descripcion", unique = false, length = 512, nullable = false)
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlanEstudio")
    private PlanEstudio planEstudio;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "itemPerfilEntrada", orphanRemoval = true)
    private List<TipoPerfilEntrada> tiposPerfilEntrada;

    public ItemPerfilEntrada() {
        planEstudio = new PlanEstudio();
        tiposPerfilEntrada = new ArrayList<>();
    }

    public int getIdTipoPerfilEntrada() {
        return idTipoPerfilEntrada;
    }

    public void setIdTipoPerfilEntrada(int idTipoPerfilEntrada) {
        this.idTipoPerfilEntrada = idTipoPerfilEntrada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public List<TipoPerfilEntrada> getTiposPerfilEntrada() {
        return tiposPerfilEntrada;
    }

    public void setTiposPerfilEntrada(List<TipoPerfilEntrada> tiposPerfilEntrada) {
        this.tiposPerfilEntrada = tiposPerfilEntrada;
    }
}
