import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check = Integer.parseInt(scanner.nextLine());
        if(check % 2 == 0){
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
