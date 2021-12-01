package com.example.demo.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServies {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServies(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public String getInfo(String id, String name) {
        Long Product_id = Long.parseLong(id);
        return id + " " + name;

    }




    public Product addProduct(Product product) {
        return productRepository.save(product);
    }


    public void updateproduct(String id, Product data) {
        Long Admin_id = Long.parseLong(id);
        Long product_id = Long.parseLong(id);
        Product product = productRepository.findById(Admin_id).orElse(null);
        if (product != null) {
            product.setProductName(data.getProductName());
            product.setPrice(data.getPrice());
        }


    }
    public Product getProduct(String id){
        return productRepository.findById(Long.parseLong(id)).orElse(null);
    }

    public String deleteProduct(String id) {
        String response = "";
        Product product = productRepository.findById(Long.parseLong(id)).orElse(null);
        if (product != null) {
            productRepository.deleteById(Long.parseLong(id));
            response = "deleted";
        } else
            response = "Product not found";
        return response;
    }



}

