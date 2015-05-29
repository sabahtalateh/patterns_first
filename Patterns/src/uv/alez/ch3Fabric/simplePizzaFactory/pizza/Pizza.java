package uv.alez.ch3Fabric.simplePizzaFactory.pizza;

import uv.alez.ch3Fabric.simplePizzaFactory.ingridient.*;

public abstract class Pizza {
    protected String name;
    protected Dough dough;
    protected Sauce sauce;
    protected Veggies veggies[];
    protected Cheese cheese;
    protected Peperoni peperoni;
    protected Clams clam;

    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza");
    }

    public void box() {
        System.out.println("Place the pizza in PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
