package com.design.strategy;

public class StreetFighter {

    public static void main(String[] args) {

        // Making behaviors
        JumpBehaviour shortJump = new ShortJump();
        JumpBehaviour longJump = new LongJump();
        KickBehaviour tornadoKick = new TornadoKick();

        // Make fighter with desired behaviour
        Fighter ken = new CharacterKen(tornadoKick, shortJump);
        ken.display();
        ken.punch();
        ken.kick();
        ken.jump();

        // change the behavior dynamically
        ken.setJumpBehaviour(longJump);
        ken.jump();



    }
}
