package cr.ac.ucr.ie.sigie.entity;


import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;


@Entity
@Table(name="curso")
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCurso;

    @Column(name = "sigla", unique = true, length = 10, nullable = false)
    private String sigla;

    @Column(name = "nombre", unique = false, length = 256, nullable = false)
    private String nombre;

    @Column(name = "creditos", unique = false, nullable = false)
    private int creditos;

    @Column(name = "ciclo", unique = false, length = 256, nullable = false)
    private String ciclo;

    @Column(columnDefinition = "boolean default false")
    private boolean electivo;

    @Column(name = "horasTeoria", unique = false, nullable = false)
    private int horasTeoria;

    @Column(name = "horasPractica", unique = false, nullable = false)
    private int horasPractica;

    @Column(name = "horasLaboratorio", unique = false, nullable = false)
    private int horasLaboratorio;

    @Column(name = "horasTeoricoPractica", unique = false, nullable = false)
    private int horasTeoricoPractica;

    @Column(name = "objetivoGeneral", unique = false, length = 512, nullable = false)
    private String objetivoGeneral;

    @ManyToOne(targetEntity = AreaDisciplinaria.class, fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "id_area_disciplinaria", referencedColumnName = "id_area_disciplinaria", nullable = false)
    private AreaDisciplinaria areaDisciplinaria;


    public Curso() {
        areaDisciplinaria = new AreaDisciplinaria();
    }

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
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

    public String getCiclo() {
        return ciclo;
    }

    public void setCiclo(String ciclo) {
        this.ciclo = ciclo;
    }

    public boolean isElectivo() {
        return electivo;
    }

    public void setElectivo(boolean electivo) {
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

    public int getHorasTeoricoPractica() {
        return horasTeoricoPractica;
    }

    public void setHorasTeoricoPractica(int horasTeoricoPractica) {
        this.horasTeoricoPractica = horasTeoricoPractica;
    }

    public String getObjetivoGeneral() {
        return objetivoGeneral;
    }

    public void setObjetivoGeneral(String objetivoGeneral) {
        this.objetivoGeneral = objetivoGeneral;
    }

    public AreaDisciplinaria getAreaDisciplinaria() {
        return areaDisciplinaria;
    }

    public void setAreaDisciplinaria(AreaDisciplinaria areaDisciplinaria) {
        this.areaDisciplinaria = areaDisciplinaria;
    }
}
