package com.example.demo.Product;

public class Product {
    private Long productId;
    private String productName;
    private Double price;
public Product(){}
    public Product(Long productId, String productName, Double price) {
        productId = productId;
        productName = productName;
        price = price;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        price = price;
    }
}

