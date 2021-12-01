package com.example.demo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path= "product")
public class ProductController {
    private final ProductServies productServies;

    @Autowired
    public ProductController(ProductServies productServies) {
        this.productServies = productServies;

    }


    @GetMapping
    public ResponseEntity<String> getIdandName(@RequestParam String Id, @RequestParam String name) {
        return ResponseEntity.ok().body(productServies.getInfo(Id, name));
    }



    @PostMapping
    public Product addProduct(@RequestBody Product product)
    {
        return productServies.addProduct(product);
    }

    @PutMapping("/{id}")
    public void updateProduct(@PathVariable String id, @RequestBody Product data) {
        productServies.updateproduct(id, data);

    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return productServies.getProduct(id);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable String id){
        return ResponseEntity.ok().body(productServies.deleteProduct(id));
    }


}