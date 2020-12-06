package com.pizza.pattern;

public class Olives extends PizzaDecorator {
    private Pizza pizza;

    public Olives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Olives; Price: 4";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
