package uv.alez.SimUDick.Duck;

import uv.alez.SimUDick.Behaviours.FlyNoWay;
import uv.alez.SimUDick.Behaviours.Quack;

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
