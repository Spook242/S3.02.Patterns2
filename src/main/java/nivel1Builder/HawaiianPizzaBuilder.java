package nivel1Builder;

public class HawaiianPizzaBuilder implements PizzaBuilder {

    private Pizza pizza;

    public HawaiianPizzaBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize() {
        pizza.setSize("Medium");
    }

    @Override
    public void buildDough() {
        pizza.setDough("Thin Crust");
    }

    @Override
    public void buildToppings() {
        pizza.addTopping("Ham");
        pizza.addTopping("Pineapple");
    }

    @Override
    public Pizza getPizza() {
        Pizza product = this.pizza;
        this.reset();
        return product;
    }

}

