package com.pizza.pattern;

public class Peppers extends PizzaDecorator {
    private Pizza pizza;

    public Peppers(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Peppers; Price: 2";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 2;
    }
}
