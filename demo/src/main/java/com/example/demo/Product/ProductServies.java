package com.example.demo.Product;

import org.springframework.stereotype.Service;

@Service
public class ProductServies {
//    Product product1 = new Product(1L, "dress", 500D);
//    Product product2 = new Product(2L, "shoes", 430D);

    public String getInfo(String id, String name) {
        Long Product_id = Long.parseLong(id);
        return id + " " + name;

    }

    public Product addProduct(Product product) {

        return product;
    }

    public String getProduct(String id) {
        return id;

    }

    public void updateproduct(String id, Product data) {
        Long Product_id = Long.parseLong(id);
        data.setProductName(data.getProductName());
        data.setPrice(data.getPrice());
//         data.getProductName()+""+data.


    }
}
//    public void deletProduct(String id) {
//
//    }

