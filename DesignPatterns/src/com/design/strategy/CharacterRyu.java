package com.design.strategy;

public class CharacterRyu extends Fighter{

    public CharacterRyu(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        super(kickBehaviour, jumpBehaviour);
    }

    public void display() {
        System.out.println("RYU");
    }
}
