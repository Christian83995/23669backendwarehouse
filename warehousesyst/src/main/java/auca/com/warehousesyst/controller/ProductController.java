package auca.com.warehousesyst.controller;

import auca.com.warehousesyst.exception.ResourseNotFoundException;
import auca.com.warehousesyst.model.Product;
import auca.com.warehousesyst.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {
    @Autowired
     private ProductRepository productRepository;
     @GetMapping
     public List<Product> getAllProducts(){

         return productRepository.findAll();
     }
     @PostMapping
     public Product createProduct (@RequestBody Product product){
         
         return productRepository.save(product);
     }
     @GetMapping("{id}")
     public ResponseEntity<Product> getProductById(@PathVariable long id){
         Product product = productRepository.findById(id)
                 .orElseThrow(() -> new ResourseNotFoundException("Product not exist with id:" +id));
         return ResponseEntity.ok(product);
     }
     @PutMapping("{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable long id, @RequestBody Product productDetails){
        Product updateProduct = productRepository.findById(id)
                .orElseThrow(() -> new ResourseNotFoundException("Product not exist with id:" +id));

        updateProduct.setName(productDetails.getName());
        updateProduct.setDescription(productDetails.getDescription());
        updateProduct.setQuantity(productDetails.getQuantity());
        updateProduct.setPrice(productDetails.getPrice());

        productRepository.save(updateProduct);
        return ResponseEntity.ok(updateProduct);
    }
    @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteProduct (@PathVariable long id) {
         Product product = productRepository.findById(id)
                 .orElseThrow(() -> new ResourseNotFoundException("Product not exist with id: "+id));
         productRepository.delete(product);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
