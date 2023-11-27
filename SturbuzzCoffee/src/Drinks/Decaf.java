package Drinks;

import Abstract.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf coffee";
    }

    public double cost() {
        return 1.05;
    }
}
