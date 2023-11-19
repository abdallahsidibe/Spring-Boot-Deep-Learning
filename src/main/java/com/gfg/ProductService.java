package com.gfg;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    Product product = new Product();
    public List<Product> productService() {
        List productList = new ArrayList();

        Product product1 = new Product();
        product1.setName("Ali");
        product1.setFirstName("Alice");
        product1.setLastName("Bob");

        productList.add(product1);

        Product product2 = new Product();
        product2.setName("Ali1");
        product2.setFirstName("Alice1");
        product2.setLastName("Bob1");

        productList.add(product2);

        return productList;
    }

    private List<Product> productList = new ArrayList<>();

    @PostConstruct
    public void initMethod(){
        productList.add(new Product("Laptop", "Alice", "bob"));
        productList.add(new Product("asus", "hp", "bob"));

    }

    public Product addProduct(Product product) {
        Product product1 = new Product();
        product1 =product;

        return product1;
    }
}
