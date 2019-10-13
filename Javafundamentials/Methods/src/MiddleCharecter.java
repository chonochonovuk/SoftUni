import java.util.Scanner;

public class MiddleCharecter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InTheMiddle(scanner);
    }

    static void InTheMiddle(Scanner scanner){
        String check = scanner.nextLine();

        int length = check.length();
        int result1 = 0;
        int result2 = 0;


        if (length % 2 == 0){
            result1 = length/2;
            result2 = result1 - 1;
            System.out.print(check.charAt(result2));
            System.out.print(check.charAt(result1));
            System.out.println();
        }else {
            result1 = length/2;
            System.out.println(check.charAt(result1));
        }
    }
}
