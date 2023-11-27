package Objects;

import Implementations.FlyNoWay;
import Implementations.Quack;

public class ModalDuck extends Duck {
    public ModalDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");
    }
}
