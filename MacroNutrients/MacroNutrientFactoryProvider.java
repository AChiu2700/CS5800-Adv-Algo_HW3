public class MacroNutrientFactoryProvider implements MacroNutrientAbstractFactory {
    private static final MacroNutrientFactoryProvider INSTANCE = new MacroNutrientFactoryProvider();
    private MacroNutrientFactoryProvider() {}
    public static MacroNutrientFactoryProvider getInstance() { return INSTANCE; }

    @Override public CarbFactory carbs()     { return CarbFactory.getInstance(); }
    @Override public ProteinFactory proteins(){ return ProteinFactory.getInstance(); }
    @Override public FatFactory fats()       { return FatFactory.getInstance(); }
}