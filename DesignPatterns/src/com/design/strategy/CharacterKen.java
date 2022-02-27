package com.design.strategy;

public class CharacterKen extends Fighter {

    public CharacterKen(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        super(kickBehaviour, jumpBehaviour);
    }

    public void display() {
        System.out.println("KEN");
    }


}
