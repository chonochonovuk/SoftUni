import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if(number <= 100) {
            bonus = 5.0;

        } else if(number > 1000) {
            bonus = 0.10*number;


        } else {
            bonus = 0.20*number;

        }

        if( number%2 == 0){
            bonus += 1;
        }else if(number%10 == 5) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(bonus + number);
    }

}
