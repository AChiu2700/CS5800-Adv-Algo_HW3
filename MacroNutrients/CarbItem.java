public class CarbItem implements MacroNutrientItem {
    private final String n;
    public CarbItem(String n) { this.n = n; }
    @Override public String name() { return n; }
}