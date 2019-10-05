import java.util.Scanner;

public class ExellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score = Double.parseDouble(scanner.nextLine());
        if(score >= 5.50){
            System.out.println("Excellent!");
        }
    }
}
