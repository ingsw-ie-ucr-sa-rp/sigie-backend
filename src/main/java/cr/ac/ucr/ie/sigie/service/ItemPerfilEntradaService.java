package cr.ac.ucr.ie.sigie.service;

import cr.ac.ucr.ie.sigie.repository.ItemDescripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import cr.ac.ucr.ie.sigie.entity.ItemPerfilEntrada;
import cr.ac.ucr.ie.sigie.repository.ItemPerfilEntradaRepository;

import java.util.List;

@Service
@Transactional
public class ItemPerfilEntradaService {

    @Autowired
    private ItemPerfilEntradaRepository repository;

    ItemPerfilEntradaService (ItemPerfilEntradaRepository itemPerfilEntradaRepository) {
        this.repository = itemPerfilEntradaRepository;
    }
    public List<ItemPerfilEntrada> listAll() {
        return repository.findAll();
    }

    public void save(ItemPerfilEntrada itemPerfilEntrada) {
        repository.save(itemPerfilEntrada);
    }

    public ItemPerfilEntrada get(int id) {
        return repository.findById(id).get();
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public boolean existsById(int id){
        return repository.existsById(id);
    }
}
