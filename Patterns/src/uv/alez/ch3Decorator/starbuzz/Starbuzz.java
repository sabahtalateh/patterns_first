package uv.alez.ch3Decorator.starbuzz;

import uv.alez.ch3Decorator.starbuzz.Beverage.Beverage;
import uv.alez.ch3Decorator.starbuzz.Beverage.DarkRoast;
import uv.alez.ch3Decorator.starbuzz.Beverage.Espresso;
import uv.alez.ch3Decorator.starbuzz.Condiment.Milk;
import uv.alez.ch3Decorator.starbuzz.Condiment.Mocha;
import uv.alez.ch3Decorator.starbuzz.Condiment.Soy;

public class Starbuzz {
    public static void main(String[] args) {
        Beverage b1 = new Espresso();
        //System.out.println(b1.cost());
        b1 = new Mocha(b1);
        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());

        Beverage b2 = new DarkRoast();
        b2 = new Milk(b2);
        b2 = new Milk(b2);
        b2 = new Soy(b2);

        System.out.println(b2.getDescription() + " $" + b2.cost());
    }
}
