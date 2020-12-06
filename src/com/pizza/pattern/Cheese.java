package com.pizza.pattern;

public class Cheese extends PizzaDecorator {
    private Pizza pizza;

    public Cheese(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Chesee; Price: 1";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 1;
    }
}
