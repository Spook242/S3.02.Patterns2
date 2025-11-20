package nivel1;

public class PizzaMaster {

    public void constructStandardPizza(PizzaBuilder builder) {
        builder.reset();
        builder.buildSize();
        builder.buildDough();
        builder.buildToppings();
    }
}

