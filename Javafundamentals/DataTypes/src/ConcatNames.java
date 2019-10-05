import java.util.Scanner;

public class ConcatNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fName = scanner.nextLine();
        String lName = scanner.nextLine();
        String character = scanner.nextLine();
        System.out.printf("%s%s%s",fName,character,lName);
    }
}
