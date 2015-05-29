package uv.alez.ch3Fabric.simplePizzaFactory;

import uv.alez.ch3Fabric.simplePizzaFactory.pizza.Pizza;
import uv.alez.ch3Fabric.simplePizzaFactory.store.ChicagoPizzaStore;
import uv.alez.ch3Fabric.simplePizzaFactory.store.NYPizzaStore;
import uv.alez.ch3Fabric.simplePizzaFactory.store.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName());
        System.out.println();

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza.getName());
        System.out.println();
    }
}
