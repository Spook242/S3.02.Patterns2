package nivel1Builder;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

    public class PizzaBuilderTest {

        @Test
        public void testHawaiianPizzaBuilder() {

            PizzaMaster master = new PizzaMaster();
            PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();

            master.constructStandardPizza(hawaiianBuilder);
            Pizza pizza = hawaiianBuilder.getPizza();

            assertEquals("Medium", pizza.getSize());
            assertEquals("Thin Crust", pizza.getDough());

            List<String> toppings = pizza.getToppings();
            assertEquals(2, toppings.size(), "Hauria de tenir 2 ingredients");
            assertTrue(toppings.contains("Ham"), "Hauria de contenir Ham");
            assertTrue(toppings.contains("Pineapple"), "Hauria de contenir Pineapple");
        }

        @Test
        public void testVeggiePizzaBuilder() {

            PizzaMaster master = new PizzaMaster();
            PizzaBuilder veggieBuilder = new VeggiePizzaBuilder();

            master.constructStandardPizza(veggieBuilder);
            Pizza pizza = veggieBuilder.getPizza();

            assertEquals("Large", pizza.getSize());
            assertEquals("Whole Wheat", pizza.getDough());

            List<String> toppings = pizza.getToppings();
            assertTrue(toppings.contains("Mushrooms"));
            assertTrue(toppings.contains("Bell Peppers"));
            assertTrue(toppings.contains("Onions"));
        }

    }

