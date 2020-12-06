package com.pizza.pattern;

public class Tuna extends PizzaDecorator {
    private Pizza pizza;

    public Tuna(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDesc() {
        return pizza.getDesc() + ", Tuna; Price: 4";
    }

    @Override
    public int getPrice() {
        return pizza.getPrice() + 4;
    }
}
