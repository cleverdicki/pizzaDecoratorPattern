package com.pizza.pattern;

public class MainProgram {
    public static void main(String[] args) {
        Pizza pizza = new TempPizza();

        pizza = new Cheese(pizza);
        pizza = new Chicken(pizza);
        pizza = new Mushrooms(pizza);

        System.out.println("Description order: " + pizza.getDesc());
        System.out.println("Price: " + pizza.getPrice());
    }
}
