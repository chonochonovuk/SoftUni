import java.util.Scanner;

public class BackInPast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       double money = Double.parseDouble(scanner.nextLine());
       int year = Integer.parseInt(scanner.nextLine());
       int age = 18;
       int spend = 12000;

       for (int k = 1800; k <= year; k++){
           if(k % 2 == 0){
               money -= spend;
               age++;
           }else {
               money -= spend + 50*age;
               age++;
           }
       }

       if(money >= 0){
           System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.",money);
       }else{
           money = Math.abs(money);
           System.out.printf("He will need %.2f dollars to survive.",money);
       }

    }
}
