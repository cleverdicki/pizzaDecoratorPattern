package com.pizza.pattern;

public class Tomatoes extends PizzaDecorator {
    private Pizza pizza;

    public Tomatoes(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Tomatoes; Price: 1";
    }

    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}
