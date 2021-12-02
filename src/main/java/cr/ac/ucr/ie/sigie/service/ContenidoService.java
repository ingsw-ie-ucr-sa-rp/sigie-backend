package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.repository.AreaDisciplinariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.Contenido;
import cr.ac.ucr.ie.sigie.repository.ContenidoRepository;

import java.util.List;

@Service
@Transactional
public class ContenidoService {

    @Autowired
    private ContenidoRepository repository;

    ContenidoService (ContenidoRepository contenidoRepository) {
        this.repository = contenidoRepository;
    }

    public List<Contenido> listAll() {
        return repository.findAll();
    }

    public void save(Contenido contenido) {
        repository.save(contenido);
    }

    public Contenido get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public boolean existsById(int id){
        return repository.existsById(id);
    }
}
