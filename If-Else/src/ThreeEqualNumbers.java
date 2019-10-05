import java.nio.charset.IllegalCharsetNameException;
import java.util.Scanner;

public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        if (x == y && x == z && y == z){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
