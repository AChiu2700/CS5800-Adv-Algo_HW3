public class FatItem implements MacroNutrientItem {
    private final String n;
    public FatItem(String n) { this.n = n; }
    @Override public String name() { return n; }
}