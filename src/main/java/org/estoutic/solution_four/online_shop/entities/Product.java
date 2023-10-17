package org.estoutic.solution_four.online_shop.entities;

import org.estoutic.solution_four.online_shop.enums.Category;

public class Product {

    public double cost;
    public String name;
    public Category category;


    public Product(String name, double cost, Category category) {
        this.name = name;
        this.cost = cost;

        this.category = category;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString(){
        return " Name : " + name + "\n Cost : " + cost + "\n Category : " + category;
    }
}
