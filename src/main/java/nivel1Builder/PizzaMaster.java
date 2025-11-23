package nivel1Builder;

public class PizzaMaster {

    public void constructStandardPizza(PizzaBuilder builder) {
        builder.reset();
        builder.buildSize();
        builder.buildDough();
        builder.buildToppings();
    }
}

