import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int turns = Integer.parseInt(scanner.nextLine());
        double scores = 0;
        double zero9 = 0;
        double ten19 = 0;
        double twenty29 = 0;
        double thity39 = 0;
        double forty50 = 0;
        double invalidN = 0;
        char c = '%';

        for (int k = 0; k < turns; k++){
            int num = Integer.parseInt(scanner.nextLine());

            if(num >= 0 && num <= 9){
                scores += num*0.2;
                zero9++;
            }else if(num >= 10 && num <= 19){
                scores += num*0.3;
                ten19++;
            }else if(num >= 20 && num <= 29){
                scores += num*0.4;
                twenty29++;
            }else if(num >= 30 && num <= 39){
                scores += 50;
                thity39++;
            }else if(num >= 40 && num <= 50){
                scores += 100;
                forty50++;
            }else if(num < 0 || num > 50){
                scores = scores/2;
                invalidN++;
            }
        }

        zero9 = zero9/turns*100;
        ten19 = ten19/turns*100;
        twenty29 = twenty29/turns*100;
        thity39 = thity39/turns*100;
        forty50 = forty50/turns*100;
        invalidN = invalidN/turns*100;

        System.out.printf("%.2f\n", scores);
        System.out.printf("From 0 to 9: %.2f%c\n", zero9,c);
        System.out.printf("From 10 to 19: %.2f%c\n", ten19,c);
        System.out.printf("From 20 to 29: %.2f%c\n", twenty29,c);
        System.out.printf("From 30 to 39: %.2f%c\n", thity39,c);
        System.out.printf("From 40 to 50: %.2f%c\n", forty50,c);
        System.out.printf("Invalid numbers: %.2f%c\n", invalidN,c);

    }
}
