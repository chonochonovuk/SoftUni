package BattleManager;

import java.util.*;

public class Main {
    public static class Persons {
        private String name;
        private int health;
        private  int energy;


    public Persons(String name, int health, int energy) {
            this.name = name;
            this.health = health;
            this.energy = energy;
        }

        public String getName() {
            return name;
        }

        public int getHealth() {
            return health;
        }

        public int getEnergy() {
            return energy;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        public void setEnergy(int energy) {
            this.energy = energy;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persons> persons = new ArrayList<>();
        String command;
        while (!"Results".equals(command = scanner.nextLine())){
            String[] commArr = command.split(":");
            switch (commArr[0]){
                case "Add":
                    String name = commArr[1];
                    Persons existing = findPerson(name,persons);
                    if (existing != null){
                        existing.setHealth(existing.getHealth() + Integer.parseInt(commArr[2]));
                    }else {
                        persons.add(new Persons(name,Integer.parseInt(commArr[2]),Integer.parseInt(commArr[3])));
                    }
                    break;
                case "Attack":
                    String attacker = commArr[1];
                    String defender = commArr[2];
                    Persons findAttacker = findPerson(attacker,persons);
                    Persons findDefender = findPerson(defender,persons);
                    if (findAttacker != null && findDefender != null){
                        findDefender.setHealth(findDefender.getHealth() - Integer.parseInt(commArr[3]));
                        if (findDefender.getHealth() <= 0){
                            System.out.printf("%s was disqualified!%n",findDefender.getName());
                            persons.remove(findDefender);
                        }
                        findAttacker.setEnergy(findAttacker.getEnergy() - 1);
                        if (findAttacker.getEnergy() <= 0){
                            System.out.printf("%s was disqualified!%n",findAttacker.getName());
                            persons.remove(findAttacker);
                        }
                    }
                    break;
                case "Delete":
                    if(commArr[1].equals("All")){
                        persons = new ArrayList<>();
                    }else{
                        String del = commArr[1];
                        Persons toDel = findPerson(del,persons);
                        if (toDel != null){
                            persons.remove(toDel);
                        }
                    }
                    break;
            }
        }

        System.out.println("People count: " + persons.size());
        persons.stream().sorted((a1,a2) -> {
            int res = Integer.compare(a2.getHealth(),a1.getHealth());
            if (res == 0){
                res = a1.getName().compareTo(a2.getName());
            }
            return res;
        }).forEach(e -> System.out.printf("%s - %d - %d%n",e.getName(),e.getHealth(),e.getEnergy()));
    }

    private static Persons findPerson(String name, List<Persons> persons) {
        for (Persons person : persons) {
            if (person.getName().equals(name)){
                return person;
            }
        }

        return null;
    }
}
