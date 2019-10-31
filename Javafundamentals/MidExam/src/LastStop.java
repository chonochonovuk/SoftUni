import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LastStop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> paintNumbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command;
        while (!"END".equals(command = scanner.nextLine())){
            String[] CommArr = command.split(" ");
            switch (CommArr[0]){
                case "Change":
                    int first = Integer.parseInt(CommArr[1]);
                    int toChange = Integer.parseInt(CommArr[2]);
                    if (paintNumbers.contains(first)){
                        int index = paintNumbers.indexOf(first);
                        paintNumbers.set(index,toChange);
                    }
                    break;
                case "Hide":
                    int toRemove = Integer.parseInt(CommArr[1]);
                    if (paintNumbers.contains(toRemove)){
                        paintNumbers.remove(Integer.valueOf(toRemove));
                    }
                    break;
                case "Switch":
                    int firstToSwitch = Integer.parseInt(CommArr[1]);
                    int secChange = Integer.parseInt(CommArr[2]);
                    if (paintNumbers.contains(firstToSwitch) && paintNumbers.contains(secChange)) {
                        int fInx = paintNumbers.indexOf(firstToSwitch);
                        int sInx = paintNumbers.indexOf(secChange);
                        paintNumbers.set(fInx, secChange);
                        paintNumbers.set(sInx, firstToSwitch);
                    }
                    break;
                case "Insert":
                    int inxIns = Integer.parseInt(CommArr[1]) + 1;
                    int toIns = Integer.parseInt(CommArr[2]);
                    if (inxIns >= 0 && inxIns < paintNumbers.size()){
                        paintNumbers.add(inxIns,toIns);
                    }
                    break;
                case "Reverse":
                    Collections.reverse(paintNumbers);
                    break;
            }
        }

        System.out.println(paintNumbers.toString().replaceAll("[\\[\\],]",""));
    }
}
