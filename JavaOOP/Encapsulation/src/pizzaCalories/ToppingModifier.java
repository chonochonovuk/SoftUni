package pizzaCalories;

public enum ToppingModifier {

    Meat(1.2),
    Veggies(0.8),
    Cheese(1.1),
    Sauce(0.9);
    private double modifier;
    ToppingModifier(double modifier){
    this.modifier = modifier;
    }
    public double calculateCalories(double weight){
       return this.modifier * weight;
    }
}