package HB.service;


import HB.entity.Pizza;
import HB.repository.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaService {

    @Autowired
    private PizzaRepository pizzaRepository;

    public void save(Pizza pizza){
        pizzaRepository.save(pizza);
    }

    public List<Pizza> getAll(){
        return pizzaRepository.findAll();
    }

    public Pizza findById(int id){
        return pizzaRepository.findById(id).get();
    }

    public void delete(Pizza pizza){
        pizzaRepository.delete(pizza);
    }

    public void deleteById(int id){
        pizzaRepository.deleteById(id);
    }
}
