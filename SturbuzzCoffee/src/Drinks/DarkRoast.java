package Drinks;

import Abstract.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark roast coffee";
    }

    public double cost() {
        return 0.99;
    }
}
