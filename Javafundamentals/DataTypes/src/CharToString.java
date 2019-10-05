import java.util.Scanner;

public class CharToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mix = "";

        for (int i = 1 ; i <= 3; i++){
            char n = scanner.nextLine().charAt(0);
            mix += n;
        }

        for (int m = 2; m >= 0; m-- ){
            char l = mix.charAt(m);
            System.out.printf("%c ",l);
        }
        System.out.println();
    }
}
