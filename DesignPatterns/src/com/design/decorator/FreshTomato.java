package com.design.decorator;

public class FreshTomato extends ToppingDecorator {

    // This is the most important step: We create the reference to the object that we are
    // decorating, in this case: Pizza
    Pizza pizza; // So, we create a reference here

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public int getCost() {
        return 40 + pizza.getCost(); // Here, 40 is the price of decorating pizza with fresh tomato
    }

    @Override
    public String getDescription() {
        // Notice here, we are adding the fresh tomato to the pizza
        return pizza.getDescription() + "Fresh Tomato" ;
    }
}
// Other toppings can be coded in similar way
