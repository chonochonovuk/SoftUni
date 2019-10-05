import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        int sum = first + second + third;
        int minutes = sum/60;
        int secondsLeft = sum - minutes*60;
        if(secondsLeft < 10) {
            System.out.printf("%d:0%d",minutes, secondsLeft);
        }else {
            System.out.printf("%d:%d",minutes,secondsLeft);
        }
    }
}
