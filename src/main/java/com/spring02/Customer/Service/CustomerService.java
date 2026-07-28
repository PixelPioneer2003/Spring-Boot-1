package com.spring02.Customer.Service;

import com.spring02.Customer.Repository.CustomerRepo;
import com.spring02.Customer.Repository.ProductRepo;
import com.spring02.Customer.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerService {
    @Autowired
     CustomerRepo cr;
    @Autowired
     ProductRepo pr;
    public List<Customer> getAllCustomers() {
        return cr.getAllCustomers();
    }

    // Get customer by ID
    public Customer getCustomerById(int id) {
        return cr.getCustomerById(id);
    }

    // Add customer
    public void addCustomer(Customer customer) {
        cr.addCustomer(customer);
    }

    // Delete customer
    public void deleteCustomer(int id) {
        cr.deleteCustomer(id);
    }



}
