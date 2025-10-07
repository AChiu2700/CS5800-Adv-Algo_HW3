public class Customer {
    private final String name;
    private final DietPlan plan;

    public Customer(String name, DietPlan plan) {
        this.name = name;
        this.plan = plan;
    }
    public String getName() { return name; }
    public DietPlan getPlan() { return plan; }
}