package uv.alez.ch3Decorator.starbuzz;

import uv.alez.ch3Decorator.starbuzz.Beverage.Beverage;
import uv.alez.ch3Decorator.starbuzz.Beverage.DarkRoast;
import uv.alez.ch3Decorator.starbuzz.Beverage.Espresso;
import uv.alez.ch3Decorator.starbuzz.Beverage.HouseBlend;
import uv.alez.ch3Decorator.starbuzz.Condiment.Mocha;
import uv.alez.ch3Decorator.starbuzz.Condiment.Soy;
import uv.alez.ch3Decorator.starbuzz.Condiment.Whip;

public class Starbuzz {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
