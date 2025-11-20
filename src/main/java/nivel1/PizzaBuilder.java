package nivel1;

public interface PizzaBuilder {

    void reset();
    void buildSize();
    void buildDough();
    void buildToppings();
    Pizza getPizza();
}

