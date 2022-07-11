package HB.service;


import HB.entity.Order;
import HB.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;


    public void save(Order order){
        repository.save(order);
    }

    public Optional<Order> findById(long id){
        return repository.findById(id);
    }

    public List<Order> findAll(){
        return repository.findAll();
    }

    public void deleteById(long id){
        repository.deleteById(id);
    }
}
