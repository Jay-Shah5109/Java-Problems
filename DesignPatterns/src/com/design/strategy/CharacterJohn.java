package com.design.strategy;

public class CharacterJohn extends Fighter {

    public CharacterJohn(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        super(kickBehaviour, jumpBehaviour);
    }

    public void display() {
        System.out.println("JOHN");
    }
}
