package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.entity.Curso;
import cr.ac.ucr.ie.sigie.entity.CursoElectivo;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICurso;
import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.ICursoElectivo;
import cr.ac.ucr.ie.sigie.repository.CursoElectivoRepository;
import cr.ac.ucr.ie.sigie.repository.CursoRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
@Transactional
public class CursoElectivoService {

    @Autowired
    private CursoElectivoRepository repository;

    public List<CursoElectivo> listAll() {
        return repository.findAll();
    }

    public List<ICursoElectivo> getCursos(){
        return repository.findAllBy();
    }

    public void save(CursoElectivo curso) {
        repository.save(curso);
    }

    public CursoElectivo get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
