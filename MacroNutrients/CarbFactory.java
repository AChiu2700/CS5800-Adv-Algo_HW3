import java.util.*;

public class CarbFactory{
    private static final CarbFactory INSTANCE = new CarbFactory();
    private static final List<String> base = List.of("Cheese", "Bread", "Lentils", "Pistachio");
    private CarbFactory() {}
    public static CarbFactory getInstance() { return INSTANCE; }

    public CarbItem createCarb(DietPlan plan, Random range) {
        List<String> options = new ArrayList<>(base);

        switch (plan){
            case NO_RESTRICTION -> {}
            case VEGAN -> { options.remove("Cheese"); }
            case NUT_ALLERGY -> { options.remove("Pistachio"); }
            case PALEO -> { return new CarbItem("Pistachio"); }
        }

        return new CarbItem(options.get(range.nextInt(options.size())));
    }
}