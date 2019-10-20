import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbsIn = scanner.nextLine();

        List<Integer> numbs = Arrays.stream(numbsIn.split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());

        receiveCommands(scanner,numbs);
    }

    private static void receiveCommands(Scanner scanner, List<Integer> numbs) {
        String comm = "";

        while (!"End".equals(comm = scanner.nextLine())){
            String[] operation = comm.split("\\s+");

            switch (operation[0]){
                case "Add":
                    int toAdd = Integer.parseInt(operation[1]);
                    numbs.add(toAdd);
                    break;
                case "Insert":
                    int toInst = Integer.parseInt(operation[1]);
                    int index = Integer.parseInt(operation[2]);
                    if (index < 0 || index >= numbs.size()){
                        System.out.println("Invalid index");
                    }else {
                        numbs.add(index, toInst);
                    }
                    break;
                case "Remove":
                    int indexToRem = Integer.parseInt(operation[1]);
                    if (indexToRem < 0 || indexToRem >= numbs.size()){
                        System.out.println("Invalid index");
                    }else {
                        numbs.remove(indexToRem);
                    }

                    break;
                case "Shift":
                    switch (operation[1]){
                        case "left":
                            int rotate = Integer.parseInt(operation[2]);
                            for (int i = 0; i < rotate; i++) {
                                int y = numbs.get(0);
                                numbs.remove(0);
                                numbs.add(y);
                            }
                            break;
                        case "right":
                            int rotateBack = Integer.parseInt(operation[2]);
                            for (int i = 0; i < rotateBack; i++) {
                                int y = numbs.get(numbs.size() - 1);
                                numbs.remove(numbs.size() - 1);
                                numbs.add(0,y);
                            }
                            break;

                    }
                    break;
            }
        }

        System.out.println(numbs.toString().replaceAll("[\\[\\],]",""));
    }
}
