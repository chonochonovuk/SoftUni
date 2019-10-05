import java.util.Scanner;

public class PrintAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int t = 0;
        for (int i = a; i <= z ; i++){
            System.out.print(i + " ");
            t += i ;
        }
        System.out.printf("%nSum: %d",t);

    }
}
