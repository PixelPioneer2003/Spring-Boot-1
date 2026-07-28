package com.spring02.Customer.Repository;

import com.spring02.Customer.model.Customer;

import com.spring02.Customer.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.spring02.Customer.Repository.CustomerRepo;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo {

    List<Product> products = new ArrayList<>();
    @Autowired
    CustomerRepo cr;

    // Get all products
    public List<Product> getAllProducts() {
        return products;
    }

    // Get product by ID
    public Product getProductById(int id) {
        for (Product p : products) {
            if (p.getProductId() == id) {
                return p;
            }
        }
        return null;
    }

    // Add a product
    public void addProduct(Product product) {
        products.add(product);
        Customer customer = cr.getCustomerById(product.getCustId());
        if (customer != null) {
            customer.getProducts().add(product);
        }

    }

    // Delete a product
    public void deleteProduct(int id) {
        for(Product p : products) {
            if (p.getProductId() == id) {
                products.remove(p);
                for(Customer c :cr.getAllCustomers()){
                    if(c.getProducts().contains(p)){
                        c.getProducts().remove(p);
                    }
                };
            }
        }

    }



}