package com.spring02.Customer.model;

public class Product
{
    private Integer productId;
    private String productName;
    private Integer custId;

    // Parameterized Constructor
    public Product(Integer productId, String productName, Integer custId) {
        this.productId = productId;
        this.productName = productName;
        this.custId = custId;
    }

    // Getter for productId
    public Integer getProductId() {
        return productId;
    }

    // Setter for productId
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Setter for productName
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter for custId
    public Integer getCustId() {
        return custId;
    }

    // Setter for custId
    public void setCustId(Integer custId) {
        this.custId = custId;
    }
}
