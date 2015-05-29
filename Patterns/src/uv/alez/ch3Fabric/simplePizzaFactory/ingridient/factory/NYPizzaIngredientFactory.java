package uv.alez.ch3Fabric.simplePizzaFactory.ingridient.factory;


import uv.alez.ch3Fabric.simplePizzaFactory.ingridient.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }



    @Override
    public Veggies[] createVeggies() {
        return new Veggies[]{
                new Grablic(),
                new Onion(),
                new Mushroom(),
                new RedPepper()
        };
    }

    @Override
    public Peperoni createPeperoni() {
        return new SlicedPeperoni();
    }

    @Override
    public Clams createClam() {
        return new FreshClam();
    }
}
