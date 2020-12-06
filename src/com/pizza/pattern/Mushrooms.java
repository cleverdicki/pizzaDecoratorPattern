package com.pizza.pattern;

public class Mushrooms extends PizzaDecorator {
    private Pizza pizza;

    public Mushrooms(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Mushrooms; Price: 3";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 3;
    }
}
