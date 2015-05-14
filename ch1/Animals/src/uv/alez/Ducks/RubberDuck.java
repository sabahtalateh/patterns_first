package uv.alez.Ducks;

import uv.alez.Behaviours.FlyNoWay;
import uv.alez.Behaviours.Squeak;

public class RubberDuck extends Duck{
    public RubberDuck(String name) {
        super(name);
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Squeak();
    }
}
