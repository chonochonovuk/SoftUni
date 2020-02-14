import java.util.*;
import java.util.stream.Collectors;

public class CustomComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comparator<Integer> orderEvenOdd = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 % 2 ==0)
                {
                    if (o2 % 2 == 0)
                    {
                        if (o1 < o2)
                            return -1;
                        else
                            return 1;
                    }
                    //if (o2 % 2 != 0)
                    else
                    {
                        return -1;
                    }
                }
                else
                {
                    if (o2 % 2 != 0)
                    {
                        if (o1 < o2)
                            return -1;
                        else
                            return 1;
                    }
                    //if (o2 % 2 == 0)
                    else
                    {
                        return 1;
                    }
                }
            }
            };

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::valueOf).sorted(orderEvenOdd)
                .forEach(x -> System.out.print(x + " "));
        System.out.println();
    }
}
