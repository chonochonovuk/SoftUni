package pizzaCalories;

public enum BackingTechnique {
    Crispy(0.9),
    Chewy(1.1),
    Homemade(1.0);
    private double modifier;
    BackingTechnique(double modifier){
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
