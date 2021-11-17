package cr.ac.ucr.ie.sigie.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.ItemDescripcion;
import cr.ac.ucr.ie.sigie.repository.ItemDescripcionRepository;

import java.util.List;

@Service
@Transactional
public class ItemDescripcionService {

    @Autowired
    private ItemDescripcionRepository repository;

    public List<ItemDescripcion> listAll() {
        return repository.findAll();
    }

    public void save(ItemDescripcion itemDescripcion) {
        repository.save(itemDescripcion);
    }

    public ItemDescripcion get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
