package hierarchy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();
        String command;
        while (!"End".equals(command = scanner.nextLine())){
            String[] animal = command.split("\\s+");
            String[] food = scanner.nextLine().split("\\s+");
            try{
                Animal animalCast = extractAnimalFrom(animal);
                Food feed = extractFood(food);
                if (animalCast != null){
                    animalCast.makeSound();
                    animals.add(animalCast);
                    animalCast.eat(feed);
                }
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal);
        }

    }

    private static Food extractFood(String[] food) {
        switch (food[0]){
            case "Vegetable":
                return new Vegetable(Integer.valueOf(food[1]));
            case "Meat":
                return new Meat(Integer.valueOf(food[1]));
            default:
                return null;
        }

    }

    private static Animal extractAnimalFrom(String[] animal) {
        switch (animal[0]){
            case "Cat":
                return new Cat(animal[0],animal[1],Double.valueOf(animal[2]),animal[3],animal[4]);
            case "Tiger":
                return new Tiger(animal[0],animal[1],Double.valueOf(animal[2]),animal[3]);
            case "Mouse":
                return new Mouse(animal[0],animal[1],Double.valueOf(animal[2]),animal[3]);
            case "Zebra":
                return new Zebra(animal[0],animal[1],Double.valueOf(animal[2]),animal[3]);
            default:
                return null;
        }
    }
}
