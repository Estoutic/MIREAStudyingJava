package org.estoutic.solution_four.online_shop.entities;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> items = new ArrayList<>();

    public void addProduct(Product product) {
        items.add(product);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Product item : items) {
            total += item.getCost();
        }
        return total;
    }

    public void getCurrentProducts(){
        items.forEach(product -> System.out.println(product.toString() + "\n"));
        System.out.println("Total Price : " + this.getTotalPrice());
    }


    public void clearCart() {
        items.clear();
    }
}
