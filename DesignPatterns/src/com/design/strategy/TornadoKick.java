package com.design.strategy;

public class TornadoKick implements KickBehaviour{
    @Override
    public void kick() {
        System.out.println("Tornado Kick");
    }
}
