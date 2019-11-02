import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TanksCollector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tanks = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        int times = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < times; i++) {
            String[] newTanks = scanner.nextLine().split(", ");

            switch (newTanks[0]){
                case "Add":
                    if(tanks.contains(newTanks[1])){
                        System.out.println("Tank is already bought");
                    }else{
                        System.out.println("Tank successfully bought");
                        tanks.add(newTanks[1]);
                    }
                    break;
                case "Remove":
                    if (tanks.contains(newTanks[1])){
                        System.out.println("Tank successfully sold");
                        tanks.remove(newTanks[1]);
                    }else {
                        System.out.println("Tank not found");
                    }
                    break;
                case "Remove At":
                    int index = Integer.parseInt(newTanks[1]);
                    if (index >= 0 && index < tanks.size()){
                       tanks.remove(index);
                        System.out.println("Tank successfully sold");
                    }else {
                        System.out.println("Index out of range");
                    }
                    break;
                case "Insert":
                    int inxIns = Integer.parseInt(newTanks[1]);
                    if(inxIns >= 0 && inxIns < tanks.size()){
                       if (tanks.contains(newTanks[2])){
                           System.out.println("Tank is already bought");
                       }else {

                           tanks.add(inxIns,newTanks[2]);
                           System.out.println("Tank successfully bought");
                       }
                    }else {
                        System.out.println("Index out of range");
                    }
                    break;
            }
        }


        System.out.println(tanks.toString().replaceAll("[\\[\\]]",""));
    }
}
