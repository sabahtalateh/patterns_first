package uv.alez.Ducks;

import uv.alez.Behaviours.FlyBehaviour;
import uv.alez.Behaviours.QuackBehaviour;

public class Duck {
    private String name;

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public Duck(String name) {
        this.name = name;
    }

    public void swim() {
        System.out.println(name + " swims");
    }

    public void performQuack() {
        System.out.println(name + " ");
        quackBehaviour.quack();
    }

    public void performFly() {
        System.out.println(name + " ");
        flyBehaviour.fly();
    }
}
