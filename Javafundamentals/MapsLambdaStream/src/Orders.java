import java.util.*;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<Double>> products = new LinkedHashMap<>();
        String command;
        while (!"buy".equals(command = scanner.nextLine())){
            String[] comm = command.split(" ");
            String product = comm[0];
            Double price = Double.parseDouble(comm[1]);
            Double quantity = Double.parseDouble(comm[2]);
            List<Double> f = new ArrayList<>();
            if (!products.containsKey(product)) {
                f.add(price);
                f.add(quantity);
                products.put(product,f);
            }else {
               products.get(product).set(0,price);
               products.get(product).set(1, products.get(product).get(1) + quantity);
               products.put(product,products.get(product));
            }
        }

        for (Map.Entry<String, List<Double>> prod : products.entrySet()) {
            System.out.printf("%s -> %.2f%n",prod.getKey(),prod.getValue().stream().reduce((a,b) -> a*b).get());
        }

    }
}
