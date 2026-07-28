package com.spring02.Customer.api;

import com.spring02.Customer.Service.CustomerService;
import com.spring02.Customer.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

public class RestController {
    @Autowired
    ProductService ps;
    CustomerService cs;

}
