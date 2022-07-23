package cr.ac.ucr.ie.sigie.dto.post;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class CursoPostDTO implements Serializable {

    private String nombre;
    private int creditos;
    private String ciclo;
    private boolean electivo;
    private boolean padre;
    private int horasPractica;
    private int horasTeoricoPractica;
    private int horasLaboratorio;
    private String sigla;
    private String objetivoGeneral;
    private int horasTeoria;
    private AreaDisciplinariaPostDTO areaDisciplinaria;
    private ModalidadPostDTO modalidad;
    private List<ContenidosPostDTO> contenidos;
    private List<RequisitosPostDTO> requisitos;
    private List<ReferenciasPostDTO> referencias;
    private List<CorrequisitosPostDTO> correquisitos;
    private List<UnidadesAcademicasPostDTO> unidadesAcademicas;
    private List<ItemDescripcionPostDTO> itemDescripciones;
    private List<ResultadoAprendizajePostDTO> resultadoAprendizajes;
    private List<EnfasisPostDTO> enfasis;
    private  BloqueElectivosPostDTO bloquesElectivos;
    private  PlanEstudioPostDTO planEstudio;

}
