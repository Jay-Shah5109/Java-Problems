package com.design.decorator;

public class Margherita extends Pizza{

    public Margherita() {
        description = "Margherita Pizza";
    }

    @Override
    public int getCost() {
        return 250;
    }
}
