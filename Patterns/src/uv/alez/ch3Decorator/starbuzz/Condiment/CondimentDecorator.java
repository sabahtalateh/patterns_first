package uv.alez.ch3Decorator.starbuzz.Condiment;

import uv.alez.ch3Decorator.starbuzz.Beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();

    @Override
    public double cost() {
        return 0;
    }
}
