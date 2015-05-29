package uv.alez.ch3Fabric.simplePizzaFactory.store;

import uv.alez.ch3Fabric.simplePizzaFactory.ingridient.factory.ChicagoPizzaIngredientFactory;
import uv.alez.ch3Fabric.simplePizzaFactory.ingridient.factory.NYPizzaIngredientFactory;
import uv.alez.ch3Fabric.simplePizzaFactory.ingridient.factory.PizzaIngredientFactory;
import uv.alez.ch3Fabric.simplePizzaFactory.pizza.CheesePizza;
import uv.alez.ch3Fabric.simplePizzaFactory.pizza.ClamPizza;
import uv.alez.ch3Fabric.simplePizzaFactory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (type.equals("clam")){
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }

        return pizza;
    }
}
