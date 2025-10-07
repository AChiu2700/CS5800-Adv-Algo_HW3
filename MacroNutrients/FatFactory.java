import java.util.*;

public class FatFactory {
    private static final FatFactory INSTANCE = new FatFactory();
    private static final List<String> base = List.of("Avocado", "Sour Cream", "Tuna","Peanuts");
    private FatFactory() {}
    public static FatFactory getInstance() { return INSTANCE; }

    public FatItem createFat(DietPlan plan, Random range) {
        List<String> options = new ArrayList<>(base);

        switch (plan){
            case NO_RESTRICTION -> { /*Keep as is*/ }
            case VEGAN -> { options.remove("Sour Cream"); options.remove("Tuna"); }
            case NUT_ALLERGY -> { options.remove("Peanuts"); }
            case PALEO -> { options.remove("Sour Cream"); }
        }   

        if (options.isEmpty()) {
            throw new IllegalArgumentException("No valid fat options for the given diet plan: " + plan);
        }
        return new FatItem(options.get(range.nextInt(options.size())));
    }
}