import java.util.Scanner;

public class LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char uOrL = scanner.nextLine().charAt(0);

        if (uOrL >= 65 && uOrL <= 90){
            System.out.println("upper-case");
        }else{
            System.out.println("lower-case");
        }
    }
}
