package Abstract;

public abstract class Beverage {
    public String description = "Unknown Abstract.Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
