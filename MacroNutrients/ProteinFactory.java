import java.util.*;

public class ProteinFactory {
    private static final ProteinFactory INSTANCE = new ProteinFactory();
    private static final List<String> base = List.of("Fish", "Chicken", "Beef", "Tofu");
    private ProteinFactory() {}
    public static ProteinFactory getInstance() { return INSTANCE; }

    public ProteinItem createProtein(DietPlan plan, Random range) {
        List<String> options = new ArrayList<>(base);

        switch (plan){
            case NO_RESTRICTION -> { /*Keep as is*/ }
            case VEGAN -> { options.removeAll(List.of("Fish", "Chicken", "Beef")); }
            case NUT_ALLERGY -> { }
            case PALEO -> { options.remove("Tofu"); }
        }

        if (options.isEmpty()) {
            throw new IllegalArgumentException("No valid protein options for the given diet plan: " + plan);
        }
        return new ProteinItem(options.get(range.nextInt(options.size())));
    }
}