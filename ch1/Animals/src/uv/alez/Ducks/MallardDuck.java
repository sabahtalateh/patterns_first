package uv.alez.Ducks;

import uv.alez.Behaviours.FlyWithWings;
import uv.alez.Behaviours.Quack;

public class MallardDuck extends Duck{
    public MallardDuck(String name) {
        super(name);
        quackBehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }
}
