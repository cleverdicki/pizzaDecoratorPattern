package com.pizza.pattern;

public class Pepperoni extends PizzaDecorator {
    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Pepperoni; Price: 4";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
