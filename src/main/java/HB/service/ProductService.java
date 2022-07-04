package HB.service;


import HB.entity.Product;
import HB.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(Product product){
        productRepository.save(product);
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product findById(int id){
        return productRepository.findById(id).get();
    }

    public void delete(Product product){
        productRepository.delete(product);
    }

    public void deleteById(int id){
        productRepository.deleteById(id);
    }
}
