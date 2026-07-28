package com.spring02.Customer.Service;

import com.spring02.Customer.Repository.ProductRepo;
import com.spring02.Customer.model.Product;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {
    @Autowired
    ProductRepo pr;
    public List<Product> getAllProducts() {
        return pr.getAllProducts();
    }

    public Product getProductById(int id) {
        return pr.getProductById(id);
    }

    public void addProduct(Product product) {
        pr.addProduct(product);
    }

    public void deleteProduct(int id) {
        pr.deleteProduct(id);
    }



}
