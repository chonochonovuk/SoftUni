package pizzaCalories;

public class Topping {
    private String toppingType;
    private double weight;

    public Topping(String toppingType,double weight){
        this.setToppingType(toppingType);
        this.setWeight(weight);
    }

    public double calculateCalories (){
        return ToppingModifier.valueOf(toppingType).calculateCalories(this.weight * 2);
    }

    private void setToppingType(String toppingType)  {
       try{
           this.toppingType = ToppingModifier.valueOf(toppingType).toString();
       }catch (IllegalArgumentException iea){
           throw new IllegalArgumentException("Cannot place "+ toppingType +" on top of your pizza.");
       }

    }

    private void setWeight(double weight) {
        if (weight < 1 || weight > 50){
            throw new IllegalArgumentException(this.toppingType +  " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

}

