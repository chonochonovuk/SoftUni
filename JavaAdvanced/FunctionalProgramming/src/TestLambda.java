import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class TestLambda {
    public static void main(String[] args) {
        Map<String,Integer> nameAge = new TreeMap<>();
        nameAge.put("Chono",41);
        nameAge.put("Hristo",30);
        nameAge.put("Evgenia",68);
        nameAge.put("Peter",68);

        collectionOperation(nameAge.entrySet(),
                x -> x.getValue() > 32,
                x -> System.out.println(x.getKey() + " " + x.getValue()));

    }
    
    public static <X> void collectionOperation(Iterable<X> roaster, Predicate<X> tester, Consumer<X> print){
        for (X x: roaster) {
            if (tester.test(x)){
                print.accept(x);
            }
        }
    }
}
