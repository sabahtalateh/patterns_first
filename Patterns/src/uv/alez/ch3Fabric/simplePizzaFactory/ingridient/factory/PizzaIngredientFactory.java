package uv.alez.ch3Fabric.simplePizzaFactory.ingridient.factory;

import uv.alez.ch3Fabric.simplePizzaFactory.ingridient.*;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Peperoni createPeperoni();
    public Clams createClam();
}
