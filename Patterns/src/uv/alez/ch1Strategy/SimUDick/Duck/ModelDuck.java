package uv.alez.ch1Strategy.SimUDick.Duck;


import uv.alez.ch1Strategy.SimUDick.Behaviours.FlyNoWay;
import uv.alez.ch1Strategy.SimUDick.Behaviours.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm model duck");
    }


}
