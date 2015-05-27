package uv.alez.ch3Decorator.starbuzz;

import uv.alez.ch3Decorator.starbuzz.Beverage.Beverage;
import uv.alez.ch3Decorator.starbuzz.Beverage.Espresso;
import uv.alez.ch3Decorator.starbuzz.Condiment.Mocha;

public class Starbuzz {
    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        //System.out.println(b1.cost());
        b1 = new Mocha(b1);
        b1 = new Mocha(b1);


        System.out.println(b1.getDescription() + " $" + b1.cost());
    }
}
