package uv.alez.ch3Fabric.simplePizzaFactory.ingridient.factory;

import uv.alez.ch3Fabric.simplePizzaFactory.ingridient.*;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomato();
    }

    @Override
    public Cheese createCheese() {
        return new Mozarella();
    }


    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Spinach(),
                new EggPlant(),
                new BlackOlives(),
        };
    }

    @Override
    public Peperoni createPeperoni() {
        return new SlicedPeperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClam();
    }
}
