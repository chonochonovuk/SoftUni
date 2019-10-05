import java.util.Scanner;

public class DivideModule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0;
        double p2 = 0;
        double p3 = 0;
        char c = '%';

        for(int k = 0; k < n; k++){
            int n1 = Integer.parseInt(scanner.nextLine());

            if(n1 % 2 == 0){
                p1++;
            }

            if(n1 % 3 == 0){
                p2++;
            }

            if(n1 % 4 == 0){
                p3++;
            }

        }

        p1 = p1/n*100;
        p2 = p2/n*100;
        p3 = p3/n*100;

        System.out.printf("%.2f%c\n", p1,c);
        System.out.printf("%.2f%c\n", p2,c);
        System.out.printf("%.2f%c\n", p3,c);

    }
}
