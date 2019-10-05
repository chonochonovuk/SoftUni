import java.util.Scanner;

public class Sequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int x = 1;

        while(x <= n){
            System.out.println(x);
            x = x*2+1;
        }
    }
}
