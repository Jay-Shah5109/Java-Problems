package com.design.decorator;

// Refer fresh tomato class for more description for the below steps
public class Barbeque extends ToppingDecorator{

    Pizza pizza;

    public Barbeque(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 90 + pizza.getCost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + "Barbeque Topping";
    }
}

// Other toppings can be coded in similar way