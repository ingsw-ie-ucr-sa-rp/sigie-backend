package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;

@Entity
public class ItemPerfilSalida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPerfilSalida;

    @Column(name = "descripcion", unique = false, length = 512, nullable = false)
    private String descripcion;

    @Column(name = "orden", unique = false, length = 512, nullable = false)
    private int orden;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlanEstudio")
    private PlanEstudio planEstudio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTipo")
    private TipoItemPerfilSalida tipoItemPerfilSalida;

    public ItemPerfilSalida() {
        planEstudio = new PlanEstudio();
        tipoItemPerfilSalida = new TipoItemPerfilSalida();
    }

    public int getIdTipoPerfilSalida() {
        return idTipoPerfilSalida;
    }

    public void setIdTipoPerfilSalida(int idTipoPerfilSalida) {
        this.idTipoPerfilSalida = idTipoPerfilSalida;
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

    public TipoItemPerfilSalida getTipoPerfilSalida() {
        return tipoItemPerfilSalida;
    }

    public void setTipoPerfilSalida(TipoItemPerfilSalida tipoPerfilSalida) {
        this.tipoItemPerfilSalida = tipoPerfilSalida;
    }

    public int getOrden() { return orden; }

    public void setOrden(int orden) { this.orden = orden; }
}
