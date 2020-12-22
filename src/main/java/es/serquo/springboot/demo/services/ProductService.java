package es.serquo.springboot.demo.services;

import es.serquo.springboot.demo.models.Product;
import es.serquo.springboot.demo.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(Integer productId) {
        return productRepository.findById(productId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    public Product create(Product product) {
        return productRepository.save(product);
    }

    public Product update(Integer productId, Product product) {
        Product productUpdatable = productRepository.findById(productId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        productUpdatable.setName(product.getName());
        productUpdatable.setPrice(product.getPrice());
        productUpdatable.setQuantity(product.getQuantity());
        return productRepository.save(productUpdatable);

    }

    public void delete(Integer productId) {
        Product productDeletable = productRepository.findById(productId).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
        productRepository.delete(productDeletable);
    }
}
