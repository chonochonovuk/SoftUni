import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = "";
        int index = 0;
        int turn = 0;

        while (!"End".equals(command = scanner.nextLine())){
            String[] commArr = command.split(" ");

            switch (commArr[0]){
                case "Switch":
                    index = Integer.parseInt(commArr[1]);
                    if (index >= 0 && index < numbers.size() ){
                        turn = -(numbers.get(index));
                        numbers.set(index,turn);
                    }
                    break;
                case "Change":
                    index = Integer.parseInt(commArr[1]);
                    turn = Integer.parseInt(commArr[2]);
                    if (index >= 0 && index < numbers.size() ){
                        numbers.set(index,turn);
                    }
                    break;
                case "Sum":
                    switch (commArr[1]){
                        case "Negative":
                            int negativeSum = sumOfNegOrPos(numbers, false);
                            System.out.println(negativeSum);
                            break;
                        case "Positive":
                            int positiveNum = sumOfNegOrPos(numbers, true);
                            System.out.println(positiveNum);
                            break;
                        case "All":
                            int all = sumOfNegOrPos(numbers,false) + sumOfNegOrPos(numbers,true);
                            System.out.println(all);
                            break;
                    }
                    break;
            }
        }

        printPosNumbAnd0(numbers);
    }

    private static void printPosNumbAnd0(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) >= 0){
                System.out.print(numbers.get(i) + " ");
            }

        }
    }

    private static int sumOfNegOrPos(List<Integer> numbers, boolean neg) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if ((numbers.get(i) > 0) == neg){
                sum += numbers.get(i);
            }
        }
        return sum;
    }
}
