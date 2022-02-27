package com.design.decorator;

public class FarmHouse extends Pizza {

    public FarmHouse() {
        description = "FarmHouse Pizza";
    }

    @Override
    public int getCost() {
        return 200;
    }
}
