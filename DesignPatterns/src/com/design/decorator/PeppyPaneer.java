package com.design.decorator;

public class PeppyPaneer extends Pizza {

    public PeppyPaneer() {
        description = "Peppy Paneer Pizza";
    }

    @Override
    public int getCost() {
        return 100;
    }
}
