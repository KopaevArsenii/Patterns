package Implementations;

import Interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm a flying with a rocket!");
    }
}
