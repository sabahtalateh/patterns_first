package uv.alez;

import uv.alez.Animal.Animal;
import uv.alez.Animal.Cat;
import uv.alez.Animal.Dog;
import uv.alez.Ducks.Duck;
import uv.alez.Ducks.MallardDuck;
import uv.alez.Ducks.RubberDuck;

public class Main {

    public static void main(String[] args) {
        Duck mallardDuck1 = new MallardDuck("John");
        mallardDuck1.swim();
        mallardDuck1.performQuack();
        mallardDuck1.performFly();

        System.out.println();

        Duck rubberDuck1 = new RubberDuck("Tony");
        rubberDuck1.swim();
        rubberDuck1.performQuack();
        rubberDuck1.performFly();

//        Animal dog = new Dog();
//        dog.makeSound();
//
//        Animal cat = new Cat();
//        cat.makeSound();
    }
}
