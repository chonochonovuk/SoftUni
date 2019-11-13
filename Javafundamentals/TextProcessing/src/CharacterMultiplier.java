import java.util.Scanner;

public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String first = scanner.next();
        String second = scanner.next();
        int sum = 0;
        int length = first.length();
        if (first.length() > second.length()){
            int diff = first.length() - second.length();
            int start = first.length();
            for (int i = start - diff; i < start; i++) {
                sum += first.charAt(i);
                length = second.length();
            }
        }else if (first.length() < second.length()){
            int diff = second.length() - first.length();
            int start = second.length();
            for (int i = start - diff; i < start; i++) {
                sum += second.charAt(i);
            }
        }


        for (int i = 0; i < length; i++) {
            sum += first.charAt(i)*second.charAt(i);

        }

        System.out.println(sum);

    }
}
