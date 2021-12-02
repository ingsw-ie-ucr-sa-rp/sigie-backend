package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import cr.ac.ucr.ie.sigie.entity.AreaDisciplinaria;
import cr.ac.ucr.ie.sigie.repository.AreaDisciplinariaRepository;

import java.awt.geom.Area;
import java.util.List;

@Service
@Transactional
public class AreaDisciplinariaService {

    @Autowired
    private AreaDisciplinariaRepository repository;


    AreaDisciplinariaService (AreaDisciplinariaRepository areaDisciplinariaRepository) {
        this.repository = areaDisciplinariaRepository;
    }

    public List<AreaDisciplinaria> listAll() {
        return repository.findAll();
    }

    public void save(AreaDisciplinaria areaDisciplinaria) {
        repository.save(areaDisciplinaria);
    }

    public AreaDisciplinaria get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
         repository.deleteById(id);
    }

    public boolean existsById(int id){
        return repository.existsById(id);
    }
}
