package MyOwnStack;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChonoStack<String> myStack = new ChonoStack<>();
        String command;
        while (!"END".equals(command = scanner.nextLine())){
            if (command.contains("Push")){
               String noPush = command.substring(5);
               String[] arr = noPush.split(",\\s+");
               if (arr.length > 1){
                   myStack = new ChonoStack<>(arr);
                   continue;
               }
               myStack.push(arr[0]);
            }

            if (command.contains("Pop")){
                myStack.pop();
            }
        }

        for (String s : myStack) {
            System.out.println(s);
        }

        for (String s : myStack) {
            System.out.println(s);
        }
    }
}
