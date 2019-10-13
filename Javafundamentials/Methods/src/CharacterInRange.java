import java.util.Scanner;

public class CharacterInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CharInRange(scanner);
    }

    static void CharInRange(Scanner scanner) {
        char a = scanner.nextLine().charAt(0);
        char b = scanner.nextLine().charAt(0);
        if (a < b) {
            for (char o = (char) (a + 1); o < b; o++) {
                System.out.print(o + " ");
            }
        } else if (b < a){
            for (char o = (char) (b + 1); o < a; o++) {
                System.out.print(o + " ");
            }
        }
    }
}
