import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int min = Integer.MAX_VALUE;
        int y = 0;

        while (y < x){
            int n = Integer.parseInt(scanner.nextLine());
            if(n < min){
                min = n;
            }
            y++;
        }
        System.out.println(min);
    }
}
