package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.interfaces.sigiebackend.IItemPerfilSalida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.ItemPerfilSalida;
import cr.ac.ucr.ie.sigie.repository.ItemPerfilSalidaRepository;
import java.util.List;

@Service
@Transactional
public class ItemPerfilSalidaService {

    @Autowired
    private ItemPerfilSalidaRepository repository;

    public List<IItemPerfilSalida> listAll() {
        return repository.findAllBy();
    }

    public void save(ItemPerfilSalida itemPerfilSalida) {
        repository.save(itemPerfilSalida);
    }

    public ItemPerfilSalida get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
