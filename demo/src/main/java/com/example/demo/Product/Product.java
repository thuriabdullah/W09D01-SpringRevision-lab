package com.example.demo.Product;

public class Product {
    private Long ProductId;
    private String ProductName;
    private Double Price;
public Product(){}
    public Product(Long productId, String productName, Double price) {
        ProductId = productId;
        ProductName = productName;
        Price = price;
    }

    public Long getProductId() {
        return ProductId;
    }

    public void setProductId(Long productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }
}

