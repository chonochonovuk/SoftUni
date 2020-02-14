package ListIterator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toArray = scanner.nextLine().split("\\s+");
        int length = toArray.length;
        String[] newArray = Arrays
                .copyOfRange(toArray,1,length);
        List.ListIterator<String> elementsList = new List.ListIterator<>(newArray);
        List<String> forLoop = new List<>(newArray);

        String command;




        while (!"END".equals(command = scanner.nextLine())){
            switch (command){
                case "Move":
                    if (elementsList.check()){
                        System.out.println(true);
                        elementsList.next();
                    }else {
                        System.out.println(false);
                    }
                    break;
                case "HasNext":
                       if (elementsList.check()){
                           System.out.println(true);
                       }else{
                           System.out.println(false);
                       }
                    break;
                case "Print":
                    elementsList.print();
                    break;
                case "PrintAll":
                    for (String s : forLoop) {
                        System.out.print(s + " ");
                    }
                    System.out.println();

                    break;
            }
        }

    }
}
