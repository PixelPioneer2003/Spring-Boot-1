package com.spring02.Customer.model;
import com.spring02.Customer.model.Product;
import java.util.ArrayList;
import java.util.List;
public class Customer {
    private Integer custId;
    private  String city;
    private String name;
    private List<Product> products;
    public  Customer(Integer id,String name, String city){
        this.custId=id;
        this.name=name;
        this.city=city;
        this.products=new ArrayList<>();
    }

    public Integer getCustId() {
        return custId;
    }

    public void setCustId(Integer custId) {
        this.custId = custId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


}
