package nivel1Builder;

public interface PizzaBuilder {

    void reset();
    void buildSize();
    void buildDough();
    void buildToppings();
    Pizza getPizza();
}

