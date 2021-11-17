package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.TipoPerfilEntrada;
import cr.ac.ucr.ie.sigie.repository.TipoPerfilEntradaRepository;

import java.util.List;

@Service
@Transactional
public class TipoPerfilEntradaService {

    @Autowired
    private TipoPerfilEntradaRepository repository;

    public List<TipoPerfilEntrada> listAll() {
        return repository.findAll();
    }

    public void save(TipoPerfilEntrada tipoPerfilEntrada) {
        repository.save(tipoPerfilEntrada);
    }

    public TipoPerfilEntrada get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
