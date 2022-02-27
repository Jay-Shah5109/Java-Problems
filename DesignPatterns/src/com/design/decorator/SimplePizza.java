package com.design.decorator;

public class SimplePizza extends Pizza{

    public SimplePizza() {
        description = "Simple Pizza";
    }

    @Override
    public int getCost() {
        return 50;
    }
}
