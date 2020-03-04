package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String animalType;

        while (!"Beast!".equals(animalType = scanner.nextLine())){
            String[] animalTokens = scanner.nextLine().split("\\s+");
            try {
                Animal animal;
                if ("Cat".equals(animalType)) {
                    animal = new Cat(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);

                } else if ("Kitten".equals(animalType)) {
                    animal = new Kitten(animalTokens[0], Integer.parseInt(animalTokens[1]));

                } else if ("Dog".equals(animalType)) {
                    animal = new Dog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);

                } else if ("Tomcat".equals(animalType)) {
                    animal = new Tomcat(animalTokens[0], Integer.parseInt(animalTokens[1]));

                } else {
                    animal = new Frog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
                }

                System.out.println(animal);
                animal.produceSound();

            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }catch (IndexOutOfBoundsException ex){
                System.out.println("Invalid input!");
            }

        }


    }
    private static Animal newAnimal(String animalType, String[] animalTokens) {
        switch (animalType) {
            case "Cat":
                return new Cat(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            case "Kitten":
                return new Kitten(animalTokens[0], Integer.parseInt(animalTokens[1]));
            case "Dog":
                return new Dog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            case "Tomcat":
                return new Tomcat(animalTokens[0], Integer.parseInt(animalTokens[1]));
            case "Frog":
                return new Frog(animalTokens[0], Integer.parseInt(animalTokens[1]), animalTokens[2]);
            default:
                throw new IllegalArgumentException("Invalid input!");
        }
    }

}
