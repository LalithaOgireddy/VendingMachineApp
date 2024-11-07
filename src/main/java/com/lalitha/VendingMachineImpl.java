package com.lalitha;

import com.lalitha.model.CurrencyDenominations;
import com.lalitha.model.Product;

import java.util.Arrays;

public class VendingMachineImpl implements VendingMachine {
    private Product[] products;
    private int depositPool;

    public VendingMachineImpl(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
     public void addCurrency(int amount){
        for(CurrencyDenominations denomination: CurrencyDenominations.values()) {
            if (denomination.getAmount()== amount) {
                depositPool += amount;
                System.out.println("Added amount:" + amount);
                System.out.println("Deposit Pool:" + depositPool);
            }
        }
    }

    @Override
    public int getBalance(){
        return depositPool;
    }

    @Override
    public Product request(int id){
        for(Product product: products){
            if(product.getId() == id){
                if(depositPool>= product.getPrice()){
                    depositPool-= product.getPrice();
                    System.out.println(product.examine());
                    return product;
                }else{
                    System.out.println("Insufficient balance, you need to add more amount");
                    return null;
                }
            }
        }

        System.out.println("Product Id : "+ id+" not found");
        return null;
    }

    @Override
    public int endSession(){
        int tempDepositPool = depositPool;
        depositPool = 0;
        return tempDepositPool;
    }

    @Override
    public String getDescription(int id){
        for(Product product: products){
            if(product.getId() == id) {
                return product.examine();
            }
        }
        return "Product Id : "+ id +" not found";
    }

    @Override
    public String[] getProducts(){
        String[] productsString = new String[products.length];
        for(int i = 0; i < products.length; i++) {
            productsString[i] = products[i].examine().concat(" price: " + products[i].getPrice());
        }
        return productsString;
    }
}
