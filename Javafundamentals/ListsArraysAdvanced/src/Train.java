import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String wagonsWithP = scanner.nextLine();

        int maxCapacity = Integer.parseInt(scanner.nextLine());

        List<Integer> oldWagons = StringToIntegerList(wagonsWithP);

        String addWagOrP = "";

        while (!"end".equals(addWagOrP = scanner.nextLine())) {
            if (addWagOrP.matches("Add(.*)")) {

                int addWagon = Integer.parseInt(addWagOrP.replaceAll("\\D", ""));
                oldWagons.add(addWagon);

            } else {

                int addPassengers = Integer.parseInt(addWagOrP);

                addPassengers(oldWagons, addPassengers, maxCapacity);

            }

        }

        System.out.println(oldWagons.toString().replaceAll("[\\[\\],]",""));
    }


    public static List<Integer> StringToIntegerList(String scan) {
        List<Integer> wagons = Arrays.stream(scan.split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        return wagons;
    }

    public static void addPassengers(List<Integer> oldWagons, int addPassengers, int maxCapacity) {

        for (int i = 0; i < oldWagons.size(); i++) {


            if (oldWagons.get(i) + addPassengers <= maxCapacity) {
                oldWagons.set(i, (oldWagons.get(i) + addPassengers));
                break;
            }

        }

    }
}
