import java.util.Scanner;

public class Snowball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int show = 0;
        int time = 0;
        int qual = 0;
        double val = Double.MIN_VALUE;

        for (int i = 1; i <= n; i++){
           int SnSh = Integer.parseInt(scanner.nextLine());
           int SnTm = Integer.parseInt(scanner.nextLine());
           int SnQu = Integer.parseInt(scanner.nextLine());
           double SnVal = 1;
           for ( int f = 1; f <= SnQu ;f++) {
               SnVal *= (SnSh*1.00 / SnTm);
           }

           if (SnVal > val){
               show = SnSh;
               time = SnTm;
               qual = SnQu;
               val = SnVal;
           }
        }

        System.out.printf("%d : %d = %.0f (%d)",show,time,val,qual);
    }
}
