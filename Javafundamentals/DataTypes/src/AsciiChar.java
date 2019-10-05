import java.util.Scanner;

public class AsciiChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (char i = (char)start; i <= (char)end ; i++ ){
            System.out.printf("%c ",i);
        }
    }
}
