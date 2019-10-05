import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        int h = 0;

        for(int y = 0 ; y < i ; y++ ){
            int n = Integer.parseInt(scanner.nextLine());
            h += n;

        }

        System.out.println(h);
    }
}
