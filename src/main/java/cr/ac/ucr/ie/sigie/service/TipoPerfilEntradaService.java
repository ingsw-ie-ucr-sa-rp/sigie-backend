package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.TipoPerfilSa;
import cr.ac.ucr.ie.sigie.repository.TipoPerfilEntradaRepository;

import java.util.List;

@Service
@Transactional
public class TipoPerfilEntradaService {

    @Autowired
    private TipoPerfilEntradaRepository repository;

    TipoPerfilEntradaService (TipoPerfilEntradaRepository tipoPerfilEntradaRepository) {
        this.repository = tipoPerfilEntradaRepository;
    }
    public List<TipoPerfilSa> listAll() {
        return repository.findAll();
    }

    public void save(TipoPerfilSa tipoPerfilEntrada) {
        repository.save(tipoPerfilEntrada);
    }

    public TipoPerfilSa get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public boolean existsById(int id){
        return repository.existsById(id);
    }
}
