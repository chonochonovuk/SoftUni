import java.util.Scanner;

public class TripleOfLatin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (char i = 97; i < 97 + n; i++){
            for (char l = 97; l < 97 + n; l++){
                for (char o = 97; o < 97 + n; o++){
                    System.out.printf("%c%c%c%n",i,l,o);
                }
            }
        }
    }
}
