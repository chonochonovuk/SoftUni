import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        double g = 0;
        int n = 0;
        while(n < x){
            double y = Double.parseDouble(scanner.nextLine());
            if(y < 0){
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f\n",y);
            g += y;
            n++;
        }
        System.out.printf("Total: %.2f",g);
    }
}
