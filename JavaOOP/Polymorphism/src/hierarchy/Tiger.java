package hierarchy;


import java.text.DecimalFormat;

public class Tiger extends Felime {
    private Food food;
    protected Tiger(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Vegetable){
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        this.foodEaten = food.getQuantity();
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(this.animalWeight);
        return String.format("%s[%s, %s, %s, %d]",this.animalType,this.animalName,formatted,this.livingRegion,this.foodEaten);
    }
}
