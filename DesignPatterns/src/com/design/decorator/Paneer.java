package com.design.decorator;

// Refer fresh tomato class for better understanding in steps that have been implemented below
public class Paneer extends ToppingDecorator {

    Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 70 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return "Paneer Topping" + pizza.getDescription();
    }
}

// Other toppings can be coded in similar way
