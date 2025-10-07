import java.util.ArrayList;
import java.util.List;

class Pizza{
    private String chain;
    private String size;
    private List<String> toppings;

    private Pizza(PizzaBuilder builder) {
        this.chain = builder.chain;
        this.size = builder.size;
        this.toppings = builder.toppings;
    }

    public void eat() {
        if (chain == null) {
            chain = "Custom";
        }
        System.out.println("Eating " + chain + " " + size + " pizza with " + getToppingCount() + " toppings: " + String.join(", ", toppings));
    }

    public int getToppingCount() {
        return toppings.size();
    }

    public static class PizzaBuilder {
        private String chain;
        private String size;
        private List<String> toppings = new ArrayList<>();

        public PizzaBuilder setChain(String chain) {
            this.chain = chain;
            return this;
        }

        public PizzaBuilder setSize(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder addTopping(String topping) {
            this.toppings.add(topping);
            return this;
        }

        public Pizza build() {
            if (size == null) {
                throw new IllegalStateException("Size must be set");
            }
            return new Pizza(this);
        }
    }
}