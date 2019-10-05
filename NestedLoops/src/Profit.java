import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int x5 = Integer.parseInt(scanner.nextLine());
        int sum = Integer.parseInt(scanner.nextLine());
        int mx1 = 0;
        int mx2 = 0;
        int mx5 = 0;

        for (int a = 0; a <= x1; a++){

            for (int b = 0; b <= x2; b ++){

                for (int c = 0; c <= x5; c ++ ){

                    if((a*1 + b*2 + c*5) == sum){
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.\n",a,b,c,sum);
                    }
                }
            }
        }
    }
}
