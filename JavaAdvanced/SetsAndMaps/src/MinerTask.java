import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> miners = new LinkedHashMap<>();
        String command;
        while (!"stop".equals(command = scanner.nextLine())){
            Integer quantity = Integer.parseInt(scanner.nextLine());
            miners.merge(command,quantity,Integer::sum);
        }
        miners.entrySet().stream().forEach(a -> System.out.println(a.getKey() + " -> " + a.getValue()));
    }
}
