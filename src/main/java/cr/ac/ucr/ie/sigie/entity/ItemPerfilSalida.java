package cr.ac.ucr.ie.sigie.entity;


import javax.persistence.*;


@Entity
@Table(name="item_perfil_salida")
public class ItemPerfilSalida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_tipo_perfil_salida")
    private int idTipoPerfilSalida;

    @Column(name="descripcion", length = 50, nullable = false)
    private String descripcion;

    @ManyToOne(targetEntity = PlanEstudio.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_plan_estudio", referencedColumnName = "id_plan_estudio",nullable = false)
    private PlanEstudio planEstudio;


    @ManyToOne(targetEntity = TipoItemPerfilSalida.class,fetch = FetchType.EAGER,
            cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo",nullable = false)
    private TipoItemPerfilSalida tipoItemPerfilSalida;

    public ItemPerfilSalida(int idTipoPerfilSalida, String descripcion, PlanEstudio planEstudio, TipoItemPerfilSalida tipoItemPerfilSalida) {
        this.idTipoPerfilSalida = idTipoPerfilSalida;
        this.descripcion = descripcion;
        this.planEstudio = planEstudio;
        this.tipoItemPerfilSalida = tipoItemPerfilSalida;
    }

    public ItemPerfilSalida() {
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

    public void setTipoPerfilSalida(TipoItemPerfilSalida tipoItemPerfilSalida) {
        this.tipoItemPerfilSalida = tipoItemPerfilSalida;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + idTipoPerfilSalida;//id de la clase***
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemPerfilSalida other = (ItemPerfilSalida) obj;
        if (idTipoPerfilSalida != other.idTipoPerfilSalida)//id de la clase***
            return false;
        return true;
    }
}
