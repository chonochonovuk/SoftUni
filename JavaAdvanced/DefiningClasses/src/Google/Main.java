package Google;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> allPersons = new ArrayList<>();
        String end;
        while (!"End".equals(end = scanner.nextLine())){
            String[] toArr = end.split("\\s+");
            switch (toArr.length){
                case 5:
                    String name = toArr[0];
                    String compName = toArr[2];
                    String depName = toArr[3];
                    double salary = Double.parseDouble(toArr[4]);
                    Person existingPerson = findPerson(name,allPersons);
                    if (existingPerson != null){
                        existingPerson.setPersonCompany(new Company(compName,depName,salary));
                    }else {
                        allPersons.add(new Person(name, new Company(compName,depName,salary)));
                    }
                    break;
                case 4:
                    String person = toArr[0];
                    String types = toArr[1];
                    String typeName = toArr[2];
                    String typeSpecs = toArr[3];
                    switch (types){
                        case "pokemon":
                            Person existingPersonPokemon = findPerson(person,allPersons);
                            if (existingPersonPokemon != null){
                               existingPersonPokemon.setPersonPokemon(existingPersonPokemon.getPersonPokemon()
                                       ,new Pokemon(typeName,typeSpecs));
                            }else {
                                Pokemon thePokemon = new Pokemon(typeName,typeSpecs);
                                allPersons.add(new Person(person,thePokemon));
                            }
                            break;
                        case "parents":
                            Person existingPersonParents = findPerson(person,allPersons);
                            if (existingPersonParents != null){
                                existingPersonParents.setPersonParents(existingPersonParents.getPersonParents()
                                        ,new Parents(typeName,typeSpecs));
                            }else {
                                Parents theParents = new Parents(typeName,typeSpecs);
                                allPersons.add(new Person(person,theParents));
                            }
                            break;
                        case "children":
                            Person existingPersonChildren = findPerson(person,allPersons);
                            if (existingPersonChildren != null){
                                existingPersonChildren.setPersonChildren(existingPersonChildren.getPersonChildren()
                                        , new Children(typeName,typeSpecs));
                            }else {
                                allPersons.add(new Person(person,new Children(typeName,typeSpecs)));
                            }
                            break;
                        case "car":
                            Person existingPersonCar = findPerson(person,allPersons);
                            if (existingPersonCar != null){
                                existingPersonCar.setPersonCar(new Car(typeName,Integer.parseInt(typeSpecs)));
                            }else {
                                allPersons.add(new Person(person, new Car(typeName,Integer.parseInt(typeSpecs))));
                            }

                            break;
                    }
                    break;
            }
        }

        String name = scanner.nextLine();
        Person existingPrint = findPerson(name,allPersons);
        if (existingPrint != null){
            System.out.println(existingPrint.getPersonName());
            Company companyPrint = existingPrint.getPersonCompany();
            if (companyPrint != null){
                System.out.println(companyPrint);
            }else {
                System.out.println("Company:");
            }
            Car carPrint = existingPrint.getPersonCar();
            if (carPrint != null){
                System.out.println(carPrint);
            }else {
                System.out.println("Car:");
            }
            List<Pokemon> printPokemon = existingPrint.getPersonPokemon();
            if (! printPokemon.isEmpty()){
                System.out.println("Pokemon:");
                for (Pokemon pokemon : printPokemon) {
                    System.out.println(pokemon);
                }
            }else {
                System.out.println("Pokemon:");
            }

            List<Parents> printParents = existingPrint.getPersonParents();
            if (!printParents.isEmpty()){
                System.out.println("Parents:");
                for (Parents parent : printParents) {
                    System.out.println(parent);
                }
            }else {
                System.out.println("Parents:");
            }
            List<Children> printChildren = existingPrint.getPersonChildren();
            if (!printChildren.isEmpty()){
                System.out.println("Children:");
                for (Children children : printChildren) {
                    System.out.println(children);
                }
            }else {
                System.out.println("Children:");
            }
        }

    }


    private static Person findPerson(String name, List<Person> allPersons) {
        for (Person person: allPersons) {
            if (person.getPersonName().equals(name)){
                return person;
            }
        }
        return null;
    }

}
