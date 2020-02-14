package FroggyLake.Frog;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] toArr = scanner.nextLine().split(",\\s+");
        String command = scanner.nextLine();
        if ("END".equals(command) && toArr.length != 0){
            Integer[] intArr = new Integer[toArr.length];
            for (int i = 0; i < toArr.length; i++) {
                intArr[i] = Integer.valueOf(toArr[i]);
            }
            Lake.Frog<Integer> stepOne = new Lake.Frog<>(intArr);
            while (stepOne.hasNext()){
                System.out.print(stepOne.next());
                if (stepOne.hasNext()){
                    System.out.print(", ");
                }
            }
            int firstTimer = 0;
            Lake.Frog<Integer> stepTwo = new Lake.Frog<>(intArr);
            while (stepTwo.checkStep()){
                if (firstTimer == 0){
                    System.out.print(", ");
                    firstTimer = 1;
                }
                System.out.print(stepTwo.move());
                if (stepTwo.checkStep()){
                    System.out.print(", ");
                }
            }
        }

    }
}
