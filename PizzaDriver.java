public class PizzaDriver{
    public static void main(String[] args) {

        Pizza pizza1 = new Pizza.PizzaBuilder()
                .setSize("Small")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .addTopping("Olives")
                .build();
        
        Pizza pizza2 = new Pizza.PizzaBuilder()
                .setSize("Medium")
                .addTopping("Bacon")
                .addTopping("Extra Cheese")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Olives")
                .addTopping("Pesto")
                .build();
        
        Pizza pizza3 = new Pizza.PizzaBuilder()
                .setSize("Large")
                .addTopping("Spicy Pork")
                .addTopping("Ham")
                .addTopping("Mushrooms")
                .addTopping("Tomato and Basil")
                .addTopping("Spinach")
                .addTopping("Extra Cheese")
                .addTopping("Sausage")
                .addTopping("Onions")
                .addTopping("Peppers")
                .build();

        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        Pizza pizzaHut1 = new Pizza.PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize("Large")
                .addTopping("Pepperoni")
                .addTopping("Mushrooms")
                .addTopping("Olives")
                .build();

        Pizza pizzaHut2 = new Pizza.PizzaBuilder()
                .setChain("Pizza Hut")
                .setSize("Small")
                .addTopping("Sausage")
                .addTopping("Beef")
                .build();

        pizzaHut1.eat();
        pizzaHut2.eat();

        Pizza littleCeasers1 = new Pizza.PizzaBuilder()
                .setChain("Little Ceasars")
                .setSize("Medium")
                .addTopping("Spicy Pork")
                .addTopping("Ham")
                .addTopping("Peppers")
                .addTopping("Tomato and Basil")
                .addTopping("Spinach")
                .addTopping("Extra Cheese")
                .addTopping("Sausage")
                .addTopping("Onions")
                .build();

        Pizza littleCeasers2 = new Pizza.PizzaBuilder()
                .setChain("Little Ceasars")
                .setSize("Small")
                .addTopping("Peppers")
                .addTopping("Chicken")
                .addTopping("Pesto")
                .addTopping("Bacon")
                .addTopping("Spinach")
                .addTopping("Ham and Pineapple")
                .build();

        littleCeasers1.eat();
        littleCeasers2.eat();

        Pizza dominos1 = new Pizza.PizzaBuilder()
                .setChain("Dominos")
                .setSize("Small")
                .addTopping("Pepperoni")
                .build();
        
        Pizza dominos2 = new Pizza.PizzaBuilder()
                .setChain("Dominos")
                .setSize("Large")
                .addTopping("Mushrooms")
                .addTopping("Olives")
                .addTopping("Peppers")
                .build();

        dominos1.eat();
        dominos2.eat();
    }
}