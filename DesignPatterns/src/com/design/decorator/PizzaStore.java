package com.design.decorator;

public class PizzaStore {

    public static void main(String[] args) {

        // Customer wants to order Margherita Pizza
        Pizza pizza = new Margherita();
        System.out.println("You have ordered " + pizza.getDescription() + "for Rs. " + pizza.getCost());

        // Customer wants to order Farmhouse Pizza
        Pizza pizzaFarm = new FarmHouse();
        System.out.println("You have ordered " + pizzaFarm.getDescription() + "for Rs. " + pizzaFarm.getCost());

        // Now customer needs to decorate the pizza with paneer topping
        pizzaFarm = new Paneer(pizzaFarm);

        // Oh, now the customer also wants to add fresh tomato topping to farmhouse pizza
        pizzaFarm = new FreshTomato(pizzaFarm);
        System.out.println("You have ordered" + pizzaFarm.getDescription() + "for Rs. " + pizzaFarm.getCost());

        // Now customer orders only barbeque topping without specific pizza
        Pizza pizzaNoSpecific = new Barbeque(null);
        System.out.println("You have ordered" + pizzaNoSpecific.getDescription() + "for Rs. " + pizzaNoSpecific.getCost());
    }
}
