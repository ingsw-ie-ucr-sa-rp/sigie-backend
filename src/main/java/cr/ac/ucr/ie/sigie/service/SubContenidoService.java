package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.repository.ResultadosAprendizajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.SubContenido;
import cr.ac.ucr.ie.sigie.repository.SubContenidoRepository;

import java.util.List;

@Service
@Transactional
public class SubContenidoService {

    @Autowired
    private SubContenidoRepository repository;
    SubContenidoService (SubContenidoRepository subContenidoRepository) {
        this.repository = subContenidoRepository;
    }
    public List<SubContenido> listAll() {
        return repository.findAll();
    }

    public void save(SubContenido subContenido) {
        repository.save(subContenido);
    }

    public SubContenido get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
