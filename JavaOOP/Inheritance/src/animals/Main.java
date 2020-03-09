package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String animalType;

        while (!"Beast!".equals(animalType = scanner.nextLine())){

            try {
                Animal animal = newAnimal(animalType, scanner);
                System.out.println(animal);
                animal.produceSound();
            }catch (Exception iae){
                System.out.println("Invalid input!");
            }

        }


    }
    private static Animal newAnimal(String animalType, Scanner scanner) {
        String[] animalTokens;
        switch (animalType) {
            case "Cat":
                animalTokens =  scanner.nextLine().split("\\s+");
                return new Cat(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            case "Kitten":
                animalTokens =  scanner.nextLine().split("\\s+");
                return new Kitten(animalTokens[0], Integer.parseInt(animalTokens[1]));
            case "Dog":
                animalTokens = scanner.nextLine().split("\\s+");
                return new Dog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            case "Tomcat":
                animalTokens =  scanner.nextLine().split("\\s+");
                return new Tomcat(animalTokens[0], Integer.parseInt(animalTokens[1]));
            case "Frog":
                animalTokens = scanner.nextLine().split("\\s+");
                return new Frog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            default:
                throw new IllegalArgumentException();
        }
    }

}
