package com.pizza.pattern;

public class Bacon extends PizzaDecorator {
    private Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Bacon; Price: 5";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 5;
    }
}
