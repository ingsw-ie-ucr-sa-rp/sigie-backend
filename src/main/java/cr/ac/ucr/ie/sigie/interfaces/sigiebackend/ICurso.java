package cr.ac.ucr.ie.sigie.interfaces.sigiebackend;

import cr.ac.ucr.ie.sigie.dto.get.*;
import cr.ac.ucr.ie.sigie.entity.BloqueElectivos;

import java.util.List;

public interface ICurso {
    int getIdCurso();
    String getNombre();
    String getSigla();
    String getCiclo();
    boolean getPadre();
    List<RequisitosGetDTO> getRequisitos();
    List<UnidadAcademicaGetDTO> getUnidadesAcademicasPropietarias();
    List<EnfasisGetDTO> getEnfasis();
    ModalidadGetDTO getModalidad();
    BloqueElectivoGetDTO getBloquesElectivos();

    int getCreditos();
}
