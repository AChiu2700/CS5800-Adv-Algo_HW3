public class Meal {
    private final CarbItem carb;
    private final ProteinItem protein;
    private final FatItem fat;

    public Meal(CarbItem carb, ProteinItem protein, FatItem fat) {
        this.carb = carb;
        this.protein = protein;
        this.fat = fat;
    }

    @Override
    public String toString() {
        return "Meal -> Carbs: " + carb.name()
                + ", Protein: " + protein.name()
                + ", Fats: " + fat.name();
    }
}