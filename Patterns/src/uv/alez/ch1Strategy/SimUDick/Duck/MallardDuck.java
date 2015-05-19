package uv.alez.ch1Strategy.SimUDick.Duck;


import uv.alez.ch1Strategy.SimUDick.Behaviours.FlyWithWings;
import uv.alez.ch1Strategy.SimUDick.Behaviours.Quack;

public class MallardDuck extends Duck{
    public MallardDuck() {
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {

    }


}
