package cr.ac.ucr.ie.sigie.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name="curso")
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_curso", nullable = false)
    private int idcurso;

    @Column(name="sigla", nullable = false)
    private String sigla;

    @Column(name="nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name="creditos", nullable = false)
    private int creditos;

    @Column(name="anno_en_que_se_imparte")
    private int annoEnQueSeImparte;

    @Column(name="posicion_ciclo", nullable = false)
    private int posicionCiclo;

    @Column(name="ciclo", nullable = false)
    private int ciclo;

    @Column(name="electivo", nullable = false)
    private byte electivo;

    @Column(name="horas_teoria", nullable = false)
    private int horasTeoria;

    @Column(name="horas_practica", nullable = false)
    private int horasPractica;

    @Column(name="horas_laboratorio", nullable = false)
    private int horasLaboratorio;

    @Column(name="horas_teorica_practica", nullable = false)
    private int horasTeoricaPractica;

    @Column(name="objetivo_general", nullable = false)
    private String objetivoGeneral;

    @ManyToMany(targetEntity = Curso.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "curso_requisito", joinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "id_curso"), inverseJoinColumns = @JoinColumn(name = "id_curso_requisito", referencedColumnName = "id_curso"))
    private List<Curso> requisitos;

    @ManyToMany(targetEntity = Curso.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "curso_correquisito", joinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "id_curso"), inverseJoinColumns = @JoinColumn(name = "id_curso_correquisito", referencedColumnName = "id_curso"))
    private List<Curso> correquisitos;

    @ManyToMany(targetEntity = Curso.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "curso_electivo", joinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "id_curso"), inverseJoinColumns = @JoinColumn(name = "id_curso_electivo", referencedColumnName = "id_curso"))
    private List<Curso> electivos;

    @ManyToMany(targetEntity = UnidadAcademica.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "curso_unidad_academica", joinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "id_curso"), inverseJoinColumns = @JoinColumn(name = "id_unidad_academica", referencedColumnName = "id_unidad_academica"))
    private List<UnidadAcademica> unidadesAcademicasPropietarias;

    @ManyToOne(targetEntity = PlanEstudio.class,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_plan_estudio", referencedColumnName = "id_plan_estudio",nullable = false, insertable = false, updatable = false)
    private PlanEstudio planEstudio;

    @ManyToMany(targetEntity = Enfasis.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "curso_enfasis", joinColumns = @JoinColumn(name = "id_curso", referencedColumnName = "id_curso"), inverseJoinColumns = @JoinColumn(name = "id_enfasis", referencedColumnName = "id_enfasis"))
    private List<Enfasis> enfasis;

    @ManyToOne(targetEntity = AreaDisciplinaria.class,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_area_disciplinaria", referencedColumnName = "id_area_disciplinaria",nullable = false, insertable = false, updatable = false)
    private AreaDisciplinaria areaDisciplinaria;

    @ManyToOne(targetEntity = Modalidad.class,fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_modalidad", referencedColumnName = "id_modalidad",nullable = false, insertable = false, updatable = false)
    private Modalidad modalidad;

    @OneToMany(targetEntity = ResultadosAprendizaje.class,fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso",nullable = true)
    private List<ResultadosAprendizaje> resultadosAprendizajes;

    @OneToMany(targetEntity = ReferenciaBibliografica.class,fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso",nullable = true)
    private List<ReferenciaBibliografica> referenciasBibliograficas;

    @OneToMany(targetEntity = ItemDescripcion.class,fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    @JoinColumn(name = "id_curso", referencedColumnName = "id_curso",nullable = true)
    private List<ItemDescripcion> itemesDescripcion;


    public Curso(int idcurso, String sigla, String nombre, int creditos, int annoEnQueSeImparte, int posicionCiclo, int ciclo, byte electivo, int horasTeoria, int horasPractica, int horasLaboratorio, int horasTeoricaPractica, String objetivoGeneral, List<Curso> requisitos, List<Curso> correquisitos, List<Curso> electivos, List<UnidadAcademica> unidadesAcademicasPropietarias, PlanEstudio planEstudio, List<Enfasis> enfasis, AreaDisciplinaria areaDisciplinaria, Modalidad modalidad, List<ResultadosAprendizaje> resultadosAprendizajes, List<ReferenciaBibliografica> referenciasBibliograficas, List<ItemDescripcion> itemesDescripcion) {
        this.idcurso = idcurso;
        this.sigla = sigla;
        this.nombre = nombre;
        this.creditos = creditos;
        this.annoEnQueSeImparte = annoEnQueSeImparte;
        this.posicionCiclo = posicionCiclo;
        this.ciclo = ciclo;
        this.electivo = electivo;
        this.horasTeoria = horasTeoria;
        this.horasPractica = horasPractica;
        this.horasLaboratorio = horasLaboratorio;
        this.horasTeoricaPractica = horasTeoricaPractica;
        this.objetivoGeneral = objetivoGeneral;
        this.requisitos = new ArrayList<Curso>();
        this.correquisitos =  new ArrayList<Curso>();
        this.electivos =  new ArrayList<Curso>();
        this.unidadesAcademicasPropietarias = new ArrayList<UnidadAcademica>();
        this.planEstudio = planEstudio;
        this.enfasis = new ArrayList<Enfasis>();
        this.areaDisciplinaria = areaDisciplinaria;
        this.modalidad = modalidad;
        this.resultadosAprendizajes = new ArrayList<ResultadosAprendizaje>();
        this.referenciasBibliograficas = new ArrayList<ReferenciaBibliografica>();
        this.itemesDescripcion = new ArrayList<ItemDescripcion>();
    }

    public Curso() {
        this.idcurso = 0;
        this.sigla = "";
        this.nombre = "";
        this.creditos = 0;
        this.annoEnQueSeImparte = 0;
        this.posicionCiclo = 0;
        this.ciclo = 0;
        this.electivo = 0;
        this.horasTeoria = 0;
        this.horasPractica = 0;
        this.horasLaboratorio = 0;
        this.horasTeoricaPractica = 0;
        this.objetivoGeneral = "";
        this.requisitos = new ArrayList<Curso>();
        this.correquisitos =  new ArrayList<Curso>();
        this.electivos =  new ArrayList<Curso>();
        this.unidadesAcademicasPropietarias = new ArrayList<UnidadAcademica>();
        this.planEstudio = new PlanEstudio();
        this.enfasis = new ArrayList<Enfasis>();
        this.areaDisciplinaria = new AreaDisciplinaria();
        this.modalidad = new Modalidad();
        this.resultadosAprendizajes = new ArrayList<ResultadosAprendizaje>();
        this.referenciasBibliograficas = new ArrayList<ReferenciaBibliografica>();
        this.itemesDescripcion = new ArrayList<ItemDescripcion>();
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getAnnoEnQueSeImparte() {
        return annoEnQueSeImparte;
    }

    public void setAnnoEnQueSeImparte(int annoEnQueSeImparte) {
        this.annoEnQueSeImparte = annoEnQueSeImparte;
    }

    public int getPosicionCiclo() {
        return posicionCiclo;
    }

    public void setPosicionCiclo(int posicionCiclo) {
        this.posicionCiclo = posicionCiclo;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public byte getElectivo() {
        return electivo;
    }

    public void setElectivo(byte electivo) {
        this.electivo = electivo;
    }

    public int getHorasTeoria() {
        return horasTeoria;
    }

    public void setHorasTeoria(int horasTeoria) {
        this.horasTeoria = horasTeoria;
    }

    public int getHorasPractica() {
        return horasPractica;
    }

    public void setHorasPractica(int horasPractica) {
        this.horasPractica = horasPractica;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    public int getHorasTeoricaPractica() {
        return horasTeoricaPractica;
    }

    public void setHorasTeoricaPractica(int horasTeoricaPractica) {
        this.horasTeoricaPractica = horasTeoricaPractica;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public List<Curso> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(List<Curso> requisitos) {
        this.requisitos = requisitos;
    }

    public List<Curso> getCorrequisitos() {
        return correquisitos;
    }

    public void setCorrequisitos(List<Curso> correquisitos) {
        this.correquisitos = correquisitos;
    }

    public List<Curso> getElectivos() {
        return electivos;
    }

    public void setElectivos(List<Curso> electivos) {
        this.electivos = electivos;
    }

    public List<UnidadAcademica> getUnidadesAcademicasPropietarias() {
        return unidadesAcademicasPropietarias;
    }

    public void setUnidadesAcademicasPropietarias(List<UnidadAcademica> unidadesAcademicasPropietarias) {
        this.unidadesAcademicasPropietarias = unidadesAcademicasPropietarias;
    }

    public PlanEstudio getPlanEstudio() {
        return planEstudio;
    }

    public void setPlanEstudio(PlanEstudio planEstudio) {
        this.planEstudio = planEstudio;
    }

    public List<Enfasis> getEnfasis() {
        return enfasis;
    }

    public void setEnfasis(List<Enfasis> enfasis) {
        this.enfasis = enfasis;
    }

    public AreaDisciplinaria getAreaDisciplinaria() {
        return areaDisciplinaria;
    }

    public void setAreaDisciplinaria(AreaDisciplinaria areaDisciplinaria) {
        this.areaDisciplinaria = areaDisciplinaria;
    }

    public Modalidad getModalidad() {
        return modalidad;
    }

    public void setModalidad(Modalidad modalidad) {
        this.modalidad = modalidad;
    }

    public List<ResultadosAprendizaje> getResultadosAprendizajes() {
        return resultadosAprendizajes;
    }

    public void setResultadosAprendizajes(List<ResultadosAprendizaje> resultadosAprendizajes) {
        this.resultadosAprendizajes = resultadosAprendizajes;
    }

    public List<ReferenciaBibliografica> getReferenciasBibliograficas() {
        return referenciasBibliograficas;
    }

    public void setReferenciasBibliograficas(List<ReferenciaBibliografica> referenciasBibliograficas) {
        this.referenciasBibliograficas = referenciasBibliograficas;
    }

    public List<ItemDescripcion> getItemesDescripcion() {
        return itemesDescripcion;
    }

    public void setItemesDescripcion(List<ItemDescripcion> itemesDescripcion) {
        this.itemesDescripcion = itemesDescripcion;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        return prime  + idcurso;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Curso other = (Curso) obj;
        if (idcurso != other.idcurso)
            return false;
        return true;
    }
}
