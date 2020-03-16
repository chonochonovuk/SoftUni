package hierarchy;

public class Mammal extends Animal {
    protected String livingRegion;
    protected Mammal(String animalType, String animalName, Double animalWeight,String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    void makeSound() {

    }

    @Override
    void eat(Food food) {

    }
}
