import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateForNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        List<String> arr = new ArrayList<>();
         arr = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());
        printIfLengthEqualInt(length,arr,x -> x.length() <= length,System.out::println);
    }
    public static<T> void printIfLengthEqualInt(int toCheck , Iterable<T> cycle
            , Predicate<T> checkInt, Consumer<T> print){
        for (T t: cycle) {
            if (checkInt.test(t)){
                print.accept(t);
            }
        }
    }
}
