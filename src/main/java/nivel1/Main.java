package nivel1;

public class Main {
    public static void main(String[] args) {

        PizzaMaster master = new PizzaMaster();

        System.out.println("Ordering a pre-defined Hawaiian pizza...");
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        master.constructStandardPizza(hawaiianBuilder);
        Pizza hawaiianPizza = hawaiianBuilder.getPizza();
        System.out.println("Built: " + hawaiianPizza);
        System.out.println();


        System.out.println("Ordering a pre-defined Veggie pizza...");
        PizzaBuilder veggieBuilder = new VeggiePizzaBuilder();
        master.constructStandardPizza(veggieBuilder);
        Pizza veggiePizza = veggieBuilder.getPizza();
        System.out.println("Built: " + veggiePizza);
        System.out.println();


        System.out.println("Ordering a custom pizza...");
        CustomPizzaBuilder customBuilder = new CustomPizzaBuilder();

        customBuilder.setSize("Small")
                .setDough("Deep Dish")
                .addTopping("Pepperoni")
                .addTopping("Extra Cheese");

        master.constructStandardPizza(customBuilder);

        Pizza customPizza = customBuilder.getPizza();
        System.out.println("Built: " + customPizza);
    }
}
