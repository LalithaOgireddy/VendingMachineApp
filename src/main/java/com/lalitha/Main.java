package com.lalitha;

import com.lalitha.model.Product;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Chocolate marabou = new Chocolate("Marabou",25.00,"Chocolate");
        Chocolate toffee = new Chocolate("Toffee",10.00,"Candy");
        Chocolate snickers = new Chocolate("Snickers",35.00,"Chocolate");

        Drink water = new Drink("Water",10.00,"Water",false);
        Drink mangoJuice = new Drink("Mango Juice",20.00,"Juice",false);
        Drink appyFizz = new Drink("Apple Juice",20.00,"Drink",true);

        Snack peanuts = new Snack("Salted Peanuts",15.00,"salted",true);
        Snack chips = new Snack("Potato Chips",15.00,"Onion",false);
        Snack muesliBar = new Snack("Muesli bar",35.00,"Vanilla",true);

        System.out.println(marabou.examine());
        System.out.println(toffee.examine());
        System.out.println(snickers.examine());
        System.out.println(water.examine());
        System.out.println(mangoJuice.examine());
        System.out.println(appyFizz.examine());
        System.out.println(peanuts.examine());
        System.out.println(chips.examine());
        System.out.println(muesliBar.examine());

        System.out.println(marabou.use());
        System.out.println(appyFizz.use());
        System.out.println(chips.use());

        Product[] availableProducts={marabou,toffee,snickers,water,mangoJuice,appyFizz,peanuts,chips,muesliBar};

        VendingMachine item= new VendingMachineImpl(availableProducts);
        item.addCurrency(100);
        item.request(snickers.getId());
        System.out.println(item.getDescription(snickers.getId()));
        //System.out.println(chocolate.getId());
        item.request(appyFizz.getId());
        item.getDescription(muesliBar.getId());

        String[] products= item.getProducts();
        for(String productDetails:products){
            System.out.println(productDetails);
        }

        item.endSession();
        System.out.println(item.getBalance());
    }
}