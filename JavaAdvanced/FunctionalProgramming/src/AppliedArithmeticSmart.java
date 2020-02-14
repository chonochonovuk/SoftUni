import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmeticSmart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] intOp = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();
        String comm;
        while (!"end".equals(comm = scanner.nextLine())){

            if (comm.equals("print")){
                System.out.println(Arrays.toString(intOp).replaceAll("[\\[\\],]",""));
            }else{
                Function<Integer,Integer> arithmetic = findOperation(comm);
                assert arithmetic != null;
                int[] res = Arrays.stream(intOp).map(arithmetic::apply).toArray();
                intOp = res;
            }
        }
    }

    private static Function<Integer, Integer> findOperation(String comm) {
        if (comm.equals("add")){
            return num -> num + 1;
        }
        if (comm.equals("multiply")){
            return num -> num*2;
        }
        if(comm.equals("subtract")){
            return num -> num - 1;
        }
        return null;
    }
}
