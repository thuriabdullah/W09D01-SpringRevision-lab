package com.example.demo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "product")
public class ProductController<id> {
    private final ProductServies productServies;


    @Autowired
    public ProductController(ProductServies productServies) {
        this.productServies = productServies;

    }

    @GetMapping("/{id}/{name}")
    public ResponseEntity<String> getIdandName(@RequestParam String Id, @RequestParam String name) {
        return ResponseEntity.ok().body(productServies.getInfo(Id, name));
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productServies.addProduct(product);
    }

    @GetMapping("/{id}")
    public String getProduct(@PathVariable String id) {
        return productServies.getProduct(id);

    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Product data) {
        productServies.updateproduct(id, data);

    }

//    @DeleteMapping("/{id}")
//    public void deletProduct(String id) {
//        productServies.deletProduct(id);
//    }


}