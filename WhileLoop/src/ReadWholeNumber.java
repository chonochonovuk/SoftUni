import java.util.Scanner;

public class ReadWholeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = Integer.parseInt(scanner.nextLine());

        while (f<1 || f>100){
            System.out.println("Invalid number!");
            f = Integer.parseInt(scanner.nextLine());
        }
        System.out.printf("The number is: %d",f);
    }
}
