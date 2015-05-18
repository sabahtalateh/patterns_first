package uv.alez.SimUDick;

import uv.alez.SimUDick.Behaviours.FlyRocketPowered;
import uv.alez.SimUDick.Duck.Duck;
import uv.alez.SimUDick.Duck.MallardDuck;
import uv.alez.SimUDick.Duck.ModelDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehaviour(new FlyRocketPowered());
        model.performFly();
    }
}
