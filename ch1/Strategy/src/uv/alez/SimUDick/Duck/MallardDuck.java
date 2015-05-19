package uv.alez.SimUDick.Duck;

import uv.alez.SimUDick.Behaviours.FlyWithWings;
import uv.alez.SimUDick.Behaviours.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {

    }


}
