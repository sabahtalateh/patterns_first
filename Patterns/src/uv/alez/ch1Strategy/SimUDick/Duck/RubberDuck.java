package uv.alez.ch1Strategy.SimUDick.Duck;


import uv.alez.ch1Strategy.SimUDick.Behaviours.FlyNoWay;
import uv.alez.ch1Strategy.SimUDick.Behaviours.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {

    }
}
