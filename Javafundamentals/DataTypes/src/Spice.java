import java.util.Scanner;

public class Spice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int spice = 0;
        int days = 0;
        while (n >= 100){
            spice += n - 26;
            ++days;
            n -= 10;
        }

        if (spice >= 26){
            spice -= 26;
        }

            System.out.println(days);
            System.out.println(spice);


    }
}
