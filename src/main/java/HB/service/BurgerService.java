package HB.service;


import HB.entity.Burger;
import HB.repository.BurgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BurgerService {

    @Autowired
    private BurgerRepository pizzaRepository;

    public void save(Burger pizza){
        pizzaRepository.save(pizza);
    }

    public List<Burger> getAll(){
        return pizzaRepository.findAll();
    }

    public Burger findById(int id){
        return pizzaRepository.findById(id).get();
    }

    public void delete(Burger pizza){
        pizzaRepository.delete(pizza);
    }

    public void deleteById(int id){
        pizzaRepository.deleteById(id);
    }
}
