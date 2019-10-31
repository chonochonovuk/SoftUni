import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FrogSquad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frogs = scanner.nextLine();
        List<String> frogsArr = Arrays.stream(frogs.split(" ")).collect(Collectors.toList());
        int index = 0;
        int times = 0;

        String[] commArr = scanner.nextLine().split(" ");

        while (!"Print".equals(commArr[0])){
            switch (commArr[0]){
                case "Join":
                    frogsArr.add(commArr[1]);
                    break;
                case "Jump":
                    index = Integer.parseInt(commArr[2]);
                    if ( index >= 0 && index < frogsArr.size()){
                        frogsArr.add(Integer.parseInt(commArr[2]),commArr[1]);
                    }

                    break;
                case "Dive":
                    index = Integer.parseInt(commArr[1]);
                    if ( index >= 0 && index < frogsArr.size()){
                        frogsArr.remove(index);
                    }
                    break;
                case "First":
                    times = Integer.parseInt(commArr[1]);
                    int start = 0;
                    int end = times;
                    if (times > frogsArr.size()){
                        end = frogsArr.size();
                    }
                    for (int i = start; i < end; i++) {
                        System.out.print(frogsArr.get(i) + " ");
                    }
                    System.out.println();
                    break;
                case "Last":
                    times = Integer.parseInt(commArr[1]);
                    int startI = frogsArr.size() - times;
                    int endI = frogsArr.size();
                    if (times > frogsArr.size()){
                        startI = 0;
                        times = frogsArr.size();
                    }
                    for (int i = startI; i < endI; i++) {
                        System.out.print(frogsArr.get(i) + " ");
                    }
                    System.out.println();
                    break;

            }

            commArr = scanner.nextLine().split(" ");

            }

        switch (commArr[1]){
            case "Normal":
                System.out.print("Frogs: ");
                for (String s : frogsArr) {
                    System.out.print(s + " ");
                }
                break;
            case "Reversed":
                Collections.reverse(frogsArr);
                System.out.print("Frogs: ");
                for (String s : frogsArr) {
                    System.out.print(s + " ");
                }
                break;
        }
    }
}
