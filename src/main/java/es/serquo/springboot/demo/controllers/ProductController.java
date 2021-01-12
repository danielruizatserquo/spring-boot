package es.serquo.springboot.demo.controllers;

import es.serquo.springboot.demo.models.Product;
import es.serquo.springboot.demo.services.ProductService;;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

        @Autowired
        private ProductService productService;

        @GetMapping
        public ResponseEntity<List<Product>> getProducts() {
            return new ResponseEntity<>(productService.findAll(), HttpStatus.OK);
        }

        @GetMapping("/{productId}")
        public ResponseEntity<Product> getProduct(@PathVariable Integer productId) {
            return new ResponseEntity<>(productService.findById(productId), HttpStatus.OK);
        }

        @PostMapping
        public  ResponseEntity<Product> createProduct(Product product) {
            return new ResponseEntity<>(productService.create( product), HttpStatus.CREATED);
        }

        @PutMapping("/{productId}")
        public ResponseEntity<Product>  updateProduct(@PathVariable Integer productId, Product product) {
            return new ResponseEntity<Product> (productService.update(productId, product), HttpStatus.ACCEPTED);
        }

        @DeleteMapping("/{productId}")
        public HttpStatus deleteProduct(@PathVariable Integer productId) {
            productService.delete(productId);
            return HttpStatus.OK;
          }

}

