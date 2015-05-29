package uv.alez.ch3Decorator.starbuzz.Condiment;

import uv.alez.ch3Decorator.starbuzz.Beverage.Beverage;

public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .35;
    }
}
