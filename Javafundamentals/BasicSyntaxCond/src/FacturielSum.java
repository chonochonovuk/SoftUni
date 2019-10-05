import java.util.Scanner;

public class FacturielSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fact = scanner.nextLine();
        int sum = 0;
        int f = Integer.parseInt(fact);

        for (int i = 0 ; i < fact.length() ; i++){
            int n = Character.getNumericValue(fact.charAt(i));

            int fac = 1;

            for (int l = 1 ;l <= n; l++){
                fac = fac*l;
            }
            sum += fac;
        }

        if (sum == f){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
