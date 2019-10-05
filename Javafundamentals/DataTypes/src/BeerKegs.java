import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String max = "";
        double maxs = Double.MIN_VALUE;

        for (int i = 1; i <= n; i++){
            String name = scanner.nextLine();
            double capa = Double.parseDouble(scanner.nextLine());
            int capb = Integer.parseInt(scanner.nextLine());
            double all = Math.PI*capa*capa*capb;

            if (all > maxs){
                maxs = all;
                max = name;
            }

        }

        System.out.println(max);
    }
}
