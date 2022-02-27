package com.design.strategy;

public class LightningKick implements KickBehaviour{
    @Override
    public void kick() {
        System.out.println("Lightning Kick");
    }
}
