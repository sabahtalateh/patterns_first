package uv.alez.ch1Strategy.SimUDick;


import uv.alez.ch1Strategy.SimUDick.Behaviours.FlyRocketPowered;
import uv.alez.ch1Strategy.SimUDick.Duck.Duck;
import uv.alez.ch1Strategy.SimUDick.Duck.MallardDuck;
import uv.alez.ch1Strategy.SimUDick.Duck.ModelDuck;

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
