package nivel1;

import java.util.ArrayList;
import java.util.List;

public class CustomPizzaBuilder implements PizzaBuilder {
        private Pizza pizza;

        private String size = "Medium";
        private String dough = "Classic";
        private List<String> toppings = new ArrayList<>();

        public CustomPizzaBuilder() {
            this.reset();
        }

        @Override
        public void reset() {
            this.pizza = new Pizza();
            this.toppings.clear();
            this.size = "Medium";
            this.dough = "Classic";
        }

        public CustomPizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public CustomPizzaBuilder setDough(String dough) {
            this.dough = dough;
            return this;
        }

        public CustomPizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        @Override
        public void buildSize() {
            pizza.setSize(this.size);
        }

        @Override
        public void buildDough() {
            pizza.setDough(this.dough);
        }

        @Override
        public void buildToppings() {
            if (this.toppings.isEmpty()) {
                pizza.addTopping("Cheese");
            } else {
                for (String topping : this.toppings) {
                    pizza.addTopping(topping);
                }
            }
        }

        @Override
        public Pizza getPizza() {
            Pizza product = this.pizza;
            this.reset();
            return product;
        }
    }
