package uv.alez.SimUDick.Duck;

import uv.alez.SimUDick.Behaviours.FlyBehaviour;
import uv.alez.SimUDick.Behaviours.QuackBehaviour;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void swim() {
        System.out.println("All dicks float, even decoys");
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour (QuackBehaviour quackBehaviour){
        this.quackBehaviour = quackBehaviour;
    }
}
