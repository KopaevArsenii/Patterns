package Condiments;

import Abstract.Beverage;
import Abstract.CondimentDecorator;

public class Chocolate extends CondimentDecorator {
    Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }


}
