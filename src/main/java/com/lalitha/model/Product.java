package com.lalitha.model;
import com.lalitha.util.IDGen;

public abstract class Product {
    private int id;
    private double price;
    private String productName;

    public Product(double price, String productName){
        this.id = IDGen.generateID();
        this.price = price;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public abstract String examine();

    public abstract String use();
}
