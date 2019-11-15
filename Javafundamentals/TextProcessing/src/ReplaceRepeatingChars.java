import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder noRep = new StringBuilder(input);

        for (int i = 0; i < noRep.length() - 1; i++) {
            if (noRep.charAt(i) == noRep.charAt(i + 1)) {
                noRep.deleteCharAt(i);
                i -= 1;
            }
        }

        System.out.println(noRep);


    }
}
