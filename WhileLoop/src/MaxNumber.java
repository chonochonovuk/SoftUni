import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int y = 0;

        while (y < x){
            int n = Integer.parseInt(scanner.nextLine());
            if(n > max){
                max = n;
            }
            y++;
        }
        System.out.println(max);
    }
}
