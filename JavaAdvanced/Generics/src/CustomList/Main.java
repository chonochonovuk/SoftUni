package CustomList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GenericList<String> stringGenericList = new GenericList<>();
        String command;
        while (!"END".equals(command = scanner.nextLine())){
            String[] toArray = command.split("\\s+");
            switch (toArray[0]){
                case "Add":
                    stringGenericList.add(toArray[1]);
                    break;
                case "Remove":
                    stringGenericList.remove(Integer.parseInt(toArray[1]));
                    break;
                case "Contains":
                    System.out.println(stringGenericList.contains(toArray[1]));
                    break;
                case "Swap":
                    int a = Integer.parseInt(toArray[1]);
                    int b = Integer.parseInt(toArray[2]);
                    stringGenericList.swap(a,b);
                    break;
                case "Greater":
                    System.out.println(stringGenericList.countGreaterThan(toArray[1]));
                    break;
                case "Min":
                    System.out.println(stringGenericList.getMin());
                    break;
                case "Max":
                    System.out.println(stringGenericList.getMax());
                    break;
                case "Print":
                    stringGenericList.print();
                    break;
                case "Sort":
                    stringGenericList.sort();
                    break;
            }
        }
    }
}
