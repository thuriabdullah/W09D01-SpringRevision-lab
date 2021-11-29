package com.example.demo.Product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServies {
Product product1 =new Product (1L,"dress",500D);
    Product product2 =new Product (2L,"shoes",430D);

    public String getInfo(String id, String name) {
        Long Product_id = Long.parseLong(id);
        return id + " " + name;

    }

    public String addProduct(Product product) {

        return product.getProductId() + " " + product.getProductName() + " " + product.getPrice();
    }

    public String getProduct(String id) {
        return id;

    }

    public void updateproduct(String id, Product data) {

    }

    public void deletProduct(String id) {

    }
}

//
//
//    public String getProduct(String id) {
//        Long Product_id = Long.parseLong(id);
//        for {
//            Product product:data
//        } {
//            if {
//                product.getid() == id
//            }
//            return ptoduct;
//
//
//        }
//
//
//        public String deletProduct (String id){
//            id
//        }
//        }

//    private List<Todo> todos = new ArrayList<Todo>();
//
//    public List<Todo> getTodos(){
//
//        return todos ;
//    }
//
//    public Todo addTodo(Todo todo){
//        todos.add(todo);
//        return todo;
//    }
//
//    public String getTodo(String id) {
//        return id;
//    }
//
//}
//    public Todo removeTodo(){
//        todos.remove();
//    }
//
