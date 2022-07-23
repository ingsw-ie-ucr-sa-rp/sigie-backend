package cr.ac.ucr.ie.sigie.entity;


import cr.ac.ucr.ie.sigie.dto.get.CursosPertenecientesABloqueGetDTO;
import org.modelmapper.ModelMapper;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Table(name = "bloquesElectivos")
@Entity
public class BloqueElectivos  implements Serializable {
    @Id
    private int idBloqueElectivo;

    @OneToMany(mappedBy = "bloquesElectivos")
    private List<Curso> cursosPertenecientes;

    public BloqueElectivos() {
        cursosPertenecientes = new ArrayList<>();
    }
    public int getIdBloqueElectivo() {
        return idBloqueElectivo;
    }

    public void setIdBloqueElectivo(int idBloqueElectivo) {
        this.idBloqueElectivo = idBloqueElectivo;
    }

    public List<CursosPertenecientesABloqueGetDTO> getCursosPertenecientes() {

        ModelMapper modelMapper = new ModelMapper();
        List<CursosPertenecientesABloqueGetDTO> dtos = cursosPertenecientes
                .stream()
                .map(cursosPertenecientes -> modelMapper.map(cursosPertenecientes, CursosPertenecientesABloqueGetDTO.class))
                .collect(Collectors.toList());
        return  dtos;
//        return cursosPertenecientes;
    }

    public void setCursosPertenecientes(List<Curso> cursosPertenecientes) {
        this.cursosPertenecientes = cursosPertenecientes;
    }
}
