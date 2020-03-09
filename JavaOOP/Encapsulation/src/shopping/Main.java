package shopping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        List<Product> productList = new ArrayList<>();
        String[] persons = scanner.nextLine().split("[=;]");
        String[] products = scanner.nextLine().split("[=;]");

        for (int i = 0; i < persons.length; i = i + 2) {
            try {
                Person person = new Person(persons[i],Integer.parseInt(persons[i + 1]));
                people.add(person);
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }

        for (int i = 0; i < products.length; i= i + 2) {
            try {
                productList.add(new Product(products[i],Integer.parseInt(products[i + 1])));
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }
        }
        String shopping;
        while (!"END".equals(shopping = scanner.nextLine())){
            try {
                String[] customerProduct = shopping.split("\\s+");
                Person find = existingPerson(customerProduct[0],people);
                Product findProduct = existingProduct(customerProduct[1],productList);
                if (find != null && findProduct != null){
                    find.buyProduct(findProduct);
                    System.out.printf("%s bought %s%n",find.getName(),findProduct.getName());
                }
            }catch (IllegalArgumentException iae){
                System.out.println(iae.getMessage());
            }


        }

        for (Person person : people) {
            System.out.println(person);
        }

    }

    private static Product existingProduct(String s, List<Product> productList) {
        for (Product product : productList) {
            if (product.getName().equals(s)){
                return product;
            }
        }

        return null;
    }

    private static Person existingPerson(String s, List<Person> people) {
        for (Person person : people) {
            if (person.getName().equals(s)){
                return person;
            }
        }

        return null;
    }
}
