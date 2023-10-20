package tn.esprit.cosharemsmouhib.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.cosharemsmouhib.entities.Product;
import tn.esprit.cosharemsmouhib.repositories.ProductRepository;
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
