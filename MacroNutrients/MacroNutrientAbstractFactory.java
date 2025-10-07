import java.util.Random;

public interface MacroNutrientAbstractFactory {
    CarbFactory carbs();
    ProteinFactory proteins();
    FatFactory fats();

    default Meal makeMeal(DietPlan plan, Random range) {
        var carb = carbs().createCarb(plan, range);
        var protein = proteins().createProtein(plan, range);
        var fat = fats().createFat(plan, range);
        
        return new Meal(carb, protein, fat);
    }
}