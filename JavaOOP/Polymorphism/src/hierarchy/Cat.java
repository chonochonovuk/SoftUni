package hierarchy;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;
    private Food food;
    protected Cat(String animalType, String animalName, Double animalWeight, String livingRegion,String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    void eat(Food food) {
        this.foodEaten = food.getQuantity();
    }


    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.##");
        String formatted = df.format(this.animalWeight);
        return String.format("%s[%s, %s, %s, %s, %d]",this.animalType,this.animalName,this.breed,formatted,this.livingRegion,this.foodEaten);
    }
}
