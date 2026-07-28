package com.spring02.Customer.Repository;

import com.spring02.Customer.model.Customer;
import com.spring02.Customer.model.Product;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo {
    List<Customer> customers = new ArrayList<>();
    ProductRepo pr;
    public CustomerRepo() {
        customers.add(new Customer(101, "Nikhil", "Pune"));
        customers.add(new Customer(102, "Rahul", "Delhi"));
        customers.add(new Customer(103, "Aman", "Mumbai"));
    }

    public List<Customer> getAllCustomers(){
        return customers;
    }
    public  void addCustomer(Customer c){
        customers.add(c);
    }

    public Customer getCustomerById(int id){
        for(Customer c :customers){
            if(c.getCustId()==id){
                return c;
            }
        }
        return null;
    }
    public void deleteCustomer(int id){
        for(Customer c :customers){
            if(c.getCustId()==id){
                for(Product p : pr.getAllProducts()){
                    if(p.getCustId()==id){
                        pr.deleteProduct(p.getProductId());
                    }
                }
                customers.remove(c);
                return;
            }
        }
    }


}
