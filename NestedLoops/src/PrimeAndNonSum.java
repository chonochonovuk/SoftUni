import java.util.Scanner;

public class PrimeAndNonSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.nextLine();
        int prime = 0;
        int non = 0;



        while (!num.equals("stop")){

                boolean isPr = false;
                int n = Integer.parseInt(num);
                if(n < 0){

                    System.out.println("Number is negative.");
                    num = scanner.nextLine();
                    continue;

                }

                if( n == 0 || n == 1){

                   isPr = false;
                }

                for(int i = 2; i <= n;i++){

                   if(n%i == 0 && i != n){
                       isPr = false;
                       break;

                   }else {
                       isPr = true;
                   }

                }
                if(isPr){
                    prime += n;
                }else {
                    non += n;
                }

                num = scanner.nextLine();


        }

        System.out.printf("Sum of all prime numbers is: %d\n", prime);
        System.out.printf("Sum of all non prime numbers is: %d", non);

    }
}
