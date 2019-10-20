import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        List<String> toDetonate = Arrays.stream(numbers.split("\\s+")).collect(Collectors.toList());

        String bomb = scanner.nextLine();
        String[] bombWithP = bomb.split("\\s+");


        int sum = 0;

        String p = bombWithP[0];

        while (toDetonate.contains(p)) {

            int power = Integer.parseInt(bombWithP[1]);
            int index = toDetonate.indexOf(bombWithP[0]);

            for (int i = 0; i < power; i++) {

                if (index > 0 && index < toDetonate.size() - 1) {
                    toDetonate.remove(index - 1);
                    index--;
                    toDetonate.remove(index + 1);

                } else if (index == 0) {
                    toDetonate.remove(index + 1);
                } else if (index == toDetonate.size() - 1) {
                    toDetonate.remove(index - 1);
                    index--;
                }
            }

            toDetonate.remove(index);
        }

        for (String toDet:toDetonate
             ) {
            sum += Integer.parseInt(toDet);
        }
        System.out.println(sum);
    }
}
