package uv.alez.SimUDick.Duck;

import uv.alez.SimUDick.Behaviours.FlyNoWay;
import uv.alez.SimUDick.Behaviours.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck() {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {

    }
}
