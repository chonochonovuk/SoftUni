import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        PassCheck(scanner);
    }

    static void PassCheck(Scanner scanner){
        String check = scanner.nextLine();

        if (!(check.length() >= 6 && check.length() <= 10)){
            System.out.println("Password must be between 6 and 10 characters");
        }

        if (!(check.matches("[a-zA-Z0-9]*"))){
            System.out.println("Password must consist only of letters and digits");
        }

        if (check.replaceAll("\\D","").length() < 2){
            System.out.println("Password must have at least 2 digits");
        }

        if ((check.length() >= 6 && check.length() <= 10) && (check.matches("[a-zA-Z0-9]*")) && !(check.replaceAll("\\D","").length() < 2)){
            System.out.println("Password is valid");
        }
    }
}
