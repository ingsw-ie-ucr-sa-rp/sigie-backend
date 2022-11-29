package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;

@Entity
public class ItemPerfilEntrada {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idTipoPerfilEntrada;

    @Column(name = "descripcion", unique = false, length = 512, nullable = false)
    private String descripcion;

    @Column(name = "orden", unique = false, length = 512, nullable = false)
    private int orden;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idPlanEstudio")
    private PlanEstudio planEstudio;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idTipo")
    private TipoItemPerfilEntrada tipoItemPerfilEntrada;

    public ItemPerfilEntrada() {
        planEstudio = new PlanEstudio();
        tipoItemPerfilEntrada = new TipoItemPerfilEntrada();
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

    public TipoItemPerfilEntrada getTipoPerfilEntrada() {
        return tipoItemPerfilEntrada;
    }

    public void setTipoPerfilEntrada(TipoItemPerfilEntrada tipoPerfilEntrada) {
        this.tipoItemPerfilEntrada = tipoPerfilEntrada;
    }

    public int getOrden() { return orden; }

    public void setOrden(int orden) { this.orden = orden; }


}
