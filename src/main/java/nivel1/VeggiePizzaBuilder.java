package nivel1;

    public class VeggiePizzaBuilder implements PizzaBuilder {
        private Pizza pizza;

        public VeggiePizzaBuilder() {
            this.reset();
        }

        @Override
        public void reset() {
            this.pizza = new Pizza();
        }

        @Override
        public void buildSize() {
            pizza.setSize("Large");
        }

        @Override
        public void buildDough() {
            pizza.setDough("Whole Wheat");
        }

        @Override
        public void buildToppings() {
            pizza.addTopping("Mushrooms");
            pizza.addTopping("Bell Peppers");
            pizza.addTopping("Onions");
        }

        @Override
        public Pizza getPizza() {
            Pizza product = this.pizza;
            this.reset();
            return product;
        }
    }
