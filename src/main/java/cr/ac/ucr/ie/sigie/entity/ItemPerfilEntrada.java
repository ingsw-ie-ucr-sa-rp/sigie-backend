package cr.ac.ucr.ie.sigie.entity;

import javax.persistence.*;


@Entity
@Table(name="item_perfil_entrada")
public class ItemPerfilEntrada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_item_perfil_entrada")
    private int idItemPerfilEntrada;

    @Column(name="descripcion", length = 50, nullable = true)
    private String descripcion;

    @ManyToOne(targetEntity = TipoItemPerfilEntrada.class,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo",nullable = false, insertable = false, updatable = false)
    private TipoItemPerfilEntrada tipoItemPerfilEntrada;

    @ManyToOne(targetEntity = PlanEstudio.class,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_plan_estudio", referencedColumnName = "id_plan_estudio",nullable = false, insertable = false, updatable = false)
    private PlanEstudio planEstudio;

    public ItemPerfilEntrada(int idItemPerfilEntrada, String descripcion, TipoItemPerfilEntrada tipoItemPerfilEntrada, PlanEstudio planEstudio) {
        this.idItemPerfilEntrada = idItemPerfilEntrada;
        this.descripcion = descripcion;
        this.tipoItemPerfilEntrada = tipoItemPerfilEntrada;
        this.planEstudio = planEstudio;
    }

    public ItemPerfilEntrada() {
    }

    public int getIdItemPerfilEntrada() {
        return idItemPerfilEntrada;
    }

    public void setIdItemPerfilEntrada(int idItemPerfilEntrada) {
        this.idItemPerfilEntrada = idItemPerfilEntrada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoItemPerfilEntrada getTipoPerfilEntrada() {
        return tipoItemPerfilEntrada;
    }

    public void setTipoPerfilEntrada(TipoItemPerfilEntrada tipoItemPerfilEntrada) {
        this.tipoItemPerfilEntrada = tipoItemPerfilEntrada;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime + idItemPerfilEntrada;//id de la clase***
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ItemPerfilEntrada other = (ItemPerfilEntrada) obj;
        if (idItemPerfilEntrada != other.idItemPerfilEntrada)//id de la clase***
            return false;
        return true;
    }


}
