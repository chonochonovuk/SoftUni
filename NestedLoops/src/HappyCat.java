import java.util.Scanner;

public class HappyCat {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int days = Integer.parseInt(scanner.nextLine());
       int hours = Integer.parseInt(scanner.nextLine());
       double totAll = 0;

       for (int a = 1 ; a <= days; a++){
           double tot = 0;
           for (int b = 1; b <= hours;b++){
               if(a%2 == 0 && b%2 != 0){

                 tot += 2.50;

               }else if(a%2 != 0 && b%2 == 0){

                   tot += 1.25;

               }else{
                   tot += 1.00;
               }
           }

           System.out.printf("Day: %d - %.2f leva\n",a,tot);
           totAll += tot;

       }

        System.out.printf("Total: %.2f leva\n",totAll);

    }
}
