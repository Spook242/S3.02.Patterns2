package nivel1Builder;

import java.util.ArrayList;
import java.util.List;

public class Pizza {

        private String size;
        private String dough;
        private List<String> toppings = new ArrayList<>();

        public void setSize(String size) {
            this.size = size;
        }
        public void setDough(String dough) {
            this.dough = dough;
        }
        public void addTopping(String topping) {
            this.toppings.add(topping);
        }
        public String getSize() {
        return this.size;
        }

        public String getDough() {
        return this.dough;
        }

        public List<String> getToppings() {
        return this.toppings;
    }

        @Override
        public String toString() {
            return "Pizza [Size: " + size + ", Dough: " + dough + ", Toppings: " + toppings + "]";
        }
    }

