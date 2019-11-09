import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ifStop;
        Map<String,Integer> jewel = new LinkedHashMap<>();
        while (!"stop".equals(ifStop = scanner.nextLine())){
            int quantity = Integer.parseInt(scanner.nextLine());
            Integer amount = jewel.get(ifStop);
            if (amount == null){
                jewel.put(ifStop,quantity);
            }else {
                jewel.put(ifStop,amount + quantity);
            }
        }

        for (Map.Entry<String, Integer> jewellers : jewel.entrySet()) {
            System.out.printf("%s -> %d%n",jewellers.getKey(),jewellers.getValue());
        }

    }
}
