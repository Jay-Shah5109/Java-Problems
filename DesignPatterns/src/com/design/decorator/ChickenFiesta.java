package com.design.decorator;

public class ChickenFiesta extends Pizza{

    public ChickenFiesta() {
        description = "Chicken Pizza";
    }

    @Override
    public int getCost() {
        return 300;
    }
}
