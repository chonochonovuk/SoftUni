import java.util.Scanner;

public class Histogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        double p4 = 0;
        double p5 = 0;
        char f = '%';


        for(int k = 0; k < n; k++){
            int m = Integer.parseInt(scanner.nextLine());

            if(m < 200){
                p1++;
            }else if(m >= 200 && m <= 399){
                p2++;
            }else if(m >= 400 && m <= 599){
                p3++;
            }else if(m >= 600 && m <= 799){
                p4++;
            }else if(m >= 800){
                p5++;
            }

        }

        p1 = p1/n*100;
        p2 = p2/n*100;
        p3 = p3/n*100;
        p4 = p4/n*100;
        p5 = p5/n*100;

        System.out.printf("%.2f%c\n", p1,f);
        System.out.printf("%.2f%c\n", p2,f);
        System.out.printf("%.2f%c\n", p3,f);
        System.out.printf("%.2f%c\n", p4,f);
        System.out.printf("%.2f%c\n", p5,f);


    }
}
