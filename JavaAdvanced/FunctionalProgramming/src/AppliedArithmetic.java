import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AppliedArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intOp = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        Function<Integer,Integer> add = x -> x + 1;
        Function<Integer,Integer> multi = x -> x*2;
        Function<Integer,Integer> subs = x -> x - 1;

        String command;
        while (!"end".equals(command = scanner.nextLine())){
            switch (command){
                case "add":
                    intOp = intOp.stream().map(add).collect(Collectors.toList());
                    break;
                case "multiply":
                    intOp = intOp.stream().map(multi).collect(Collectors.toList());
                    break;
                case "subtract":
                    intOp = intOp.stream().map(subs).collect(Collectors.toList());
                    break;
                case "print":
                    listPrint(intOp,x -> System.out.print(x + " "));
                    System.out.println();
                    break;

            }
        }

        //listPrint(intOp,x -> System.out.print(x + " "));

    }
//    public static <T,R> void listOps(Iterable<T> roaster, Function<T,R> math){
//        for (T t:roaster) {
//            R r = math.apply(t);
//        }
//    }
    public static <T> void listPrint(Iterable<T> roaster, Consumer<T> print){
        for (T t:roaster) {
            print.accept(t);
        }
    }
}
