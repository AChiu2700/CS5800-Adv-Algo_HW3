public class ProteinItem implements MacroNutrientItem {
    private final String n;
    public ProteinItem(String n) { this.n = n; }
    @Override public String name() { return n; }
}