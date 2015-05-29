package uv.alez.ch3Decorator.starbuzz.Condiment;

import uv.alez.ch3Decorator.starbuzz.Beverage.Beverage;

public class Milk extends CondimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return this.beverage.cost() + .15;
    }
}
