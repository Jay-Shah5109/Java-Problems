package com.design.strategy;

abstract class Fighter {

    KickBehaviour kickBehaviour;
    JumpBehaviour jumpBehaviour;

    public Fighter(KickBehaviour kickBehaviour, JumpBehaviour jumpBehaviour) {
        this.kickBehaviour = kickBehaviour;
        this.jumpBehaviour = jumpBehaviour;
    }

    public void punch() {
        System.out.println("Default Punch");
    }

    public void kick() {
        // delegate control to kick behavior
        kickBehaviour.kick();
    }

    public void jump() {
        // delegate control to jump behavior
        jumpBehaviour.jump();
    }

    public void roll() {
        System.out.println("Default Roll");
    }

    public void setKickBehaviour(KickBehaviour kickBehaviour) {
        this.kickBehaviour = kickBehaviour;
    }

    public void setJumpBehaviour(JumpBehaviour jumpBehaviour) {
        this.jumpBehaviour = jumpBehaviour;
    }

    public abstract void display();


}
