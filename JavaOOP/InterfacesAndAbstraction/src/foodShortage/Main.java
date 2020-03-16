package foodShortage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> citizens = new ArrayList<>();
        List<String> rebels = new ArrayList<>();
        Citizen citizen = null;
        Rebel rebel = null;
        for (int i = 0; i < n; i++) {
            String[] array = scanner.nextLine().split("\\s+");
            switch (array.length){
                case 3:
                    rebel = new Rebel(array[0],Integer.parseInt(array[1]),array[2]);
                    rebels.add(array[0]);
                    break;
                case 4:
                    citizen = new Citizen(array[0],Integer.parseInt(array[1]),array[2],array[3]);
                    citizens.add(array[0]);
                    break;
            }
        }
        String command;
        while (!"End".equals(command = scanner.nextLine())){
            if (rebels.contains(command)){
                rebel.buyFood();
            }
            if (citizens.contains(command)){
                citizen.buyFood();
            }
        }

        int food = 0;

        if (!rebels.isEmpty()){
            food += rebel.getFood();
        }

        if (!citizens.isEmpty()){
            food += citizen.getFood();
        }
        System.out.println(food);
    }
}
