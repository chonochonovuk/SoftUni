package hierarchy;

import java.text.DecimalFormat;

public class Zebra extends Mammal {
    private Food food;
    protected Zebra(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    void makeSound() {
        System.out.println("Zs");
    }

    @Override
    void eat(Food food) {
        if (food instanceof Meat){
            throw new IllegalArgumentException("Zebras are not eating that type of food!");
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
